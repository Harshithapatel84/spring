package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.CricketTeamDto;
import com.xworkz.monitor.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CricketComponent {

    public CricketComponent() {
        System.out.println("cricket team component is created");
    }

    @Autowired

    private CricketService cricketService;
    @RequestMapping("/cricket")
    public String team(CricketTeamDto cricketTeamDto, Model model) {

        System.out.println("running team in cricket team component");
        System.out.println(cricketTeamDto);
        model.addAttribute("message", "cricket team details saved");
        this.cricketService.validateAndSave(cricketTeamDto);
        return "/cricketTeam.jsp";
    }
}