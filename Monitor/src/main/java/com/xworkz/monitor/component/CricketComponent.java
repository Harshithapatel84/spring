package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.CricketTeamDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CricketComponent {

    public CricketComponent() {
        System.out.println("cricket team component is created");
    }

    @RequestMapping("/cricket")
    public String team(CricketTeamDto cricketTeamDto, Model model) {

        System.out.println("running team in cricket team component");
        System.out.println(cricketTeamDto);
        model.addAttribute("message", "cricket team details saved");
        return "/cricketTeam.jsp";
    }
}