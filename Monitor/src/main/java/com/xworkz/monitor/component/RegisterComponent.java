package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.RegisterDTO;
import com.xworkz.monitor.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class RegisterComponent {


    public RegisterComponent(){
        System.out.println("register component is created");
    }

    @Autowired
    private RegisterService registerService;

    @RequestMapping("/register")
    public String submit(RegisterDTO registerDTO, Model model)
    {
        System.out.println("running registerComponent");
        System.out.println("regsisterDto:"+registerDTO);
        model.addAttribute("message","register is successfful");
        this.registerService.validateAmdSave(registerDTO);
        return "/register.jsp";

    }

}
