package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.TempleDTO;
import com.xworkz.monitor.service.TempleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TempleComponet {

    public TempleComponet(){
        System.out.println("temple component is created");
    }

    @Autowired
    private TempleService templeService;

    @RequestMapping("/temple")
    public String visit(TempleDTO templeDTO, Model model)
    {
        System.out.println("running visit in temple component");
        System.out.println(templeDTO);
        model.addAttribute("message","temple details saved");
        this.templeService.validateAndSave(templeDTO);
        return "/temple.jsp";
    }
}
