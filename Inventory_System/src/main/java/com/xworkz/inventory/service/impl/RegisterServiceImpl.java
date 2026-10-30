package com.xworkz.inventory.service.impl;

import com.xworkz.inventory.dto.LoginDTO;
import com.xworkz.inventory.dto.RegisterDTO;
import com.xworkz.inventory.entity.RegisterEntity;
import com.xworkz.inventory.repo.RegisterRepo;
import com.xworkz.inventory.service.RegisterService;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterRepo registerRepo;

    @Autowired
    private BCryptPasswordEncoder bcryptPasswordEncoder;

    @Override
    public Boolean validateAndSave(RegisterDTO inventoryDTO) {
        System.out.println("running inventoryService in cerviceImpl");
        if (inventoryDTO!=null)
        {
            System.out.println("converting dto to entity");
            RegisterEntity registerEntity = new RegisterEntity();
            BeanUtils.copyProperties(inventoryDTO, registerEntity);
            registerEntity.setPassword(
                    bcryptPasswordEncoder.encode(inventoryDTO.getPassword()));
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

        if (registerDTO != null) {

            RegisterEntity registerEntity = new RegisterEntity();

            BeanUtils.copyProperties(registerDTO, registerEntity);

            RegisterEntity entity = registerRepo.update(registerEntity);

            if (entity != null) {

                updatedDto = new RegisterDTO();

                BeanUtils.copyProperties(entity, updatedDto);
            }
        }

        return updatedDto;
    }
}

