
package com.xworkz.inventory.controlller;

import com.xworkz.inventory.dto.LoginDTO;
import com.xworkz.inventory.dto.RegisterDTO;
import com.xworkz.inventory.service.RegisterService;
import com.xworkz.inventory.util.InventoryUtil;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.util.List;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    public RegisterController() {
        System.out.println("RegisterController object is created");
    }

    @GetMapping
    public String showForm(Model model) {
        System.out.println("Running showForm in RegisterController");
        model.addAttribute("inventoryDTO", new RegisterDTO());
        return "register";
    }

    @PostMapping
    public String display(@Valid @ModelAttribute("inventoryDTO") RegisterDTO inventoryDTO,
                          BindingResult bindingResult, Model model) {

        System.out.println("Running display in RegisterController");
        System.out.println("inventoryDTO: " + inventoryDTO);

        if (bindingResult.hasErrors()) {
            System.out.println("There are validation errors, fix them");

            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("inventoryDTO", inventoryDTO);

            return "register";
        } else {
            System.out.println("No validation errors, continue");

            registerService.validateAndSave(inventoryDTO);

            model.addAttribute("inventoryDTO", new RegisterDTO());
            model.addAttribute("message", "Registered successfully");

            return "register";
        }
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDTO loginDTO, Model model) {

        System.out.println("loginDto is called: " + loginDTO);

        RegisterDTO dto = registerService.checkUserByLogin(loginDTO);

        System.out.println("dto: " + dto);

        if (dto != null) {
            model.addAttribute("registerDto", dto);
            return "dashboard";
        } else {
            model.addAttribute("msg", "Login failed. Invalid email or password");
            return "login";
        }

    }

    @GetMapping("/login")
    public String showLogin(Model model) {

        model.addAttribute("loginDTO", new LoginDTO());

        return "login";
    }

    @GetMapping("/updateById")
    public String updateById(@RequestParam("id") Long id, Model model) {
        RegisterDTO registerDTO = registerService.findById(id);
        System.out.println("DTO from database: " + registerDTO);
        model.addAttribute("registerDto", registerDTO);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute RegisterDTO registerDTO, Model model) {

        System.out.println("Update method called: " + registerDTO);
        System.out.println("Profile file: " + registerDTO.getFile());
        RegisterDTO dto = registerService.update(registerDTO);
        System.out.println("DTO after update: " + dto);
        model.addAttribute("registerDto", dto);
        return "dashboard";
    }

    @GetMapping("/displayImage")
    public void displyayImage(@RequestParam("imageName") String imageName, HttpServletResponse response) throws FileNotFoundException{
        System.out.println("display Image method is called:"+imageName);
        File file = new File(InventoryUtil.IMAGE_PATH+imageName);
        FileInputStream fileInputStream=new FileInputStream(file);
        InputStream inputStream=new BufferedInputStream(fileInputStream);
        try{
            ServletOutputStream outputStream=response.getOutputStream();
            IOUtils.copy(inputStream,outputStream);
            response.flushBuffer();

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/userLogin")
    public String userLogin() {
        return "emailLogin";
    }

    @PostMapping("/emailLogin")
    public String emailLogin(@RequestParam("email") String email, Model model) {
        System.out.println("Email to login: " + email);
        Boolean isSent = registerService.sendEmail(email);
        if (Boolean.TRUE.equals(isSent)) {
            System.out.println("Controller OTP sent successfully");
            model.addAttribute("email", email);
            model.addAttribute("msg", "OTP sent successfully to your registered email. ");
            return "otp";
        } else {
            model.addAttribute("msg", "Email not registered or OTP sending failed.");
            return "emailLogin";
        }
    }

    @PostMapping("/validateOtp")
    public String validateOtp(@RequestParam("email") String email, @RequestParam("otp") String otp, Model model) {

        System.out.println("OTP to validate: " + otp);
        RegisterDTO registerDto = registerService.validateOtp(email, otp);
        if (registerDto != null) {
            model.addAttribute("registerDto", registerDto);
            return "dashboard";
        }
        model.addAttribute("error", "Invalid OTP. Please try again.");
        model.addAttribute("email", email);
        return "otp";
    }
}


