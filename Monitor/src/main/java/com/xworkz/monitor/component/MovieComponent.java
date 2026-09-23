package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.MovieDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MovieComponent {

    public MovieComponent() {
        System.out.println("movie component is created");
    }

    @RequestMapping("/movie")
    public String movie(MovieDTO movieDTO, Model model) {

        System.out.println("running movie in movie component");
        System.out.println("movieDTO: " + movieDTO);

        model.addAttribute("message", "Movie details saved");

        return "/movie.jsp";
    }
}