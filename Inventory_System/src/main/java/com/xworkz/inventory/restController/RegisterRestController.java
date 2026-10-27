
package com.xworkz.inventory.restController;

import com.xworkz.inventory.service.RegisterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class RegisterRestController {

    private final RegisterService service;

    public RegisterRestController(RegisterService service) {
        this.service = service;
        System.out.println("RegisterRestController object created");
    }

    @GetMapping("/checkEmailExist/{email:.+}")
    public String checkEmailExist(@PathVariable("email") String email) {

        System.out.println("Controller email: [" + email + "]");

        Boolean result = service.emailExist(email);

        if (result) {
            return "Email already exists";
        }

        return "Email does not exist";
    }
}
