package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.TempleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TempleComponet {

    public TempleComponet(){
        System.out.println("temple component is created");
    }

    @RequestMapping("/temple")
    public String visit(TempleDTO templeDTO, Model model)
    {
        System.out.println("running visit in temple component");
        System.out.println(templeDTO);
        model.addAttribute("message","temple details saved");
        return "/temple.jsp";
    }
}
