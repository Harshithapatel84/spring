
package com.xworkz.inventory.controlller;

import com.xworkz.inventory.dto.LoginDTO;
import com.xworkz.inventory.dto.RegisterDTO;
import com.xworkz.inventory.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
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

}
