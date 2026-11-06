package com.xworkz.inventory.service.impl;

import com.xworkz.inventory.dto.LoginDTO;
import com.xworkz.inventory.dto.RegisterDTO;
import com.xworkz.inventory.entity.RegisterEntity;
import com.xworkz.inventory.repo.RegisterRepo;
import com.xworkz.inventory.service.EmailService;
import com.xworkz.inventory.service.RegisterService;
import com.xworkz.inventory.util.InventoryUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterRepo registerRepo;

    @Autowired
    private BCryptPasswordEncoder bcryptPasswordEncoder;
    @Autowired
    private EmailService emailService;

    @Override
    public Boolean validateAndSave(RegisterDTO inventoryDTO) {
        System.out.println("running inventoryService in cerviceImpl");
        if (inventoryDTO != null) {
            System.out.println("converting dto to entity");
            RegisterEntity registerEntity = new RegisterEntity();
            registerEntity.setPassword(bcryptPasswordEncoder.encode(inventoryDTO.getPassword()));

            BeanUtils.copyProperties(inventoryDTO, registerEntity);

            registerEntity.setImageName("default.jpg");

            this.registerRepo.save(registerEntity);
            return true;
        }
        return false;
    }

    @Override
    public Boolean emailExist(String email) {

        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return registerRepo.isEmailExist(email.trim());
    }

    @Override
    public RegisterDTO checkUserByLogin(LoginDTO loginDTO) {

        System.out.println("checkLogin method is called");

        RegisterDTO registerDTO = null;

        if (loginDTO != null) {

            RegisterEntity registerEntity =
                    registerRepo.findEntityByEmail(loginDTO.getEmail());

            if (registerEntity != null) {

                if (bcryptPasswordEncoder.matches(
                        loginDTO.getPassword(),
                        registerEntity.getPassword()
                )) {

                    registerDTO = new RegisterDTO();

                    BeanUtils.copyProperties(registerEntity, registerDTO);
                }
            }
        }

        return registerDTO;
    }

    @Override
    public RegisterDTO findById(Long id) {

        RegisterEntity entity = registerRepo.findById(id);

        RegisterDTO registerDTO = null;

        if (entity != null) {

            registerDTO = new RegisterDTO();

            BeanUtils.copyProperties(entity, registerDTO);
        }

        return registerDTO;
    }

    @Override
    public RegisterDTO update(RegisterDTO registerDTO) {

        System.out.println("registerServiceImpl update method is called: " + registerDTO);

        RegisterDTO updatedDto = null;

        if (registerDTO != null && registerDTO.getId() != null) {

            MultipartFile file = registerDTO.getFile();

            if (file != null && !file.isEmpty()) {
                try {
                    byte[] b = file.getBytes();
                    //Path path = Paths.get(InventoryUtil.IMAGE_PATH + file.getOriginalFilename());
                  //  Files.write(path, b);
                    Path path = Paths.get(InventoryUtil.IMAGE_PATH, file.getOriginalFilename());
                    Files.createDirectories(path.getParent());
                    Files.write(path, b);
                    System.out.println("file saved successfully");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            RegisterEntity registerEntity = new RegisterEntity();
            BeanUtils.copyProperties(registerDTO, registerEntity);

            if (file != null && !file.isEmpty()) {
                registerEntity.setImageName(file.getOriginalFilename());
            }
            RegisterEntity entity = registerRepo.update(registerEntity);
            if (entity != null) {
                updatedDto = new RegisterDTO();
                BeanUtils.copyProperties(entity, updatedDto);
            }
        }

        return updatedDto;
    }

    @Override
    public Boolean sendEmail(String email) {

        System.out.println("sendEmail method is called: " + email);

        if (email != null && !email.trim().isEmpty()) {
            String otp = InventoryUtil.generateOtp();
            Boolean isSent = emailService.sendEmail(email, otp);
            if (isSent != null && isSent) {
                Boolean isSaved = registerRepo.saveOtp(email, otp);
                if (isSaved != null && isSaved) {
                    System.out.println("Email sent and OTP saved successfully");
                    return true;
                } else {
                    System.out.println("OTP email sent, but database saving failed");
                    return false;
                }

            } else {
                System.out.println("Email sending failed");
                return false;
            }
        }

        System.out.println("Email is invalid");
        return false;
    }

    @Override
    public RegisterDTO validateOtp(String email, String otp) {
        System.out.println("invoking validate otp:"+email+" "+otp);
        RegisterDTO registerDTO=null;
        if (email!=null && otp!=null){
            RegisterEntity entity=registerRepo.findEntityByEmail(email);

            if (entity!=null){
                if (otp.equals(entity.getOtp()))  {
                    registerDTO = new RegisterDTO();
                    BeanUtils.copyProperties(entity, registerDTO);
                }
            }
        }
        return registerDTO;
    }
}