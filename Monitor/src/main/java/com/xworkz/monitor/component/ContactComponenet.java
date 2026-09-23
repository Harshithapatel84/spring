package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.ContactDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ContactComponenet {

    public ContactComponenet() {
        System.out.println("contact component is created");
    }

    @RequestMapping("/contact")
    public String contact(ContactDTO contactDTO, Model model) {

        System.out.println("running contact in contact component");
        System.out.println("contactDTO: " + contactDTO);

        model.addAttribute("message", "Contact details saved");

        return "/contact.jsp";
    }
}