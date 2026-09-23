package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.MobileDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MobileComponent {

    public MobileComponent() {
        System.out.println("mobile component is created");
    }

    @RequestMapping("/mobile")
    public String mobile(MobileDTO mobileDTO, Model model) {

        System.out.println("running mobile in mobile component");
        System.out.println("mobileDTO: " + mobileDTO);
        model.addAttribute("message", "Mobile details saved");
        return "/mobile.jsp";
    }
}