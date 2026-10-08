package com.xworkz.opener.controller;

import com.xworkz.opener.dto.BeerDTO;
import com.xworkz.opener.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/")
public class BeerController {

    private List<String> types;
    private List<String> colors;
    private List<String> availabilities;

    public BeerController() {
        System.out.println("BeerController is created");
    }

    @PostConstruct
    public void onInit() {

        System.out.println("running onInit");

        types = Stream.of("Lager", "Ale", "Stout", "Pilsner").collect(Collectors.toList());

        colors = Stream.of("Golden", "Amber", "Dark", "Pale").collect(Collectors.toList());

        availabilities = Stream.of("Available", "Not Available", "Limited Stock").collect(Collectors.toList());
    }

    @Autowired
    private BeerService beerService;

    @PostMapping("/beer")
    public String showData(@Valid BeerDTO beerDTO,
                           BindingResult bindingResult,
                           Model model) {

        System.out.println("running beer in BeerController");
        System.out.println("beerDTO=" + beerDTO);

        if (bindingResult.hasErrors()) {

            System.out.println("there are validation errors, fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("beerDto", beerDTO);

        } else {

            System.out.println("no validation error continue to execute");
            this.beerService.validateAndSave(beerDTO);
            model.addAttribute("message", "beer details saved");
            model.addAttribute("beerDto", new BeerDTO());
        }
        model.addAttribute("types", types);
        model.addAttribute("colors", colors);
        model.addAttribute("availabilities", availabilities);

        return "/beer.jsp";
    }

    @GetMapping("/beer")
    public String showData(Model model) {
        System.out.println("running showData, loading beer.jsp");
        model.addAttribute("types", types);
        model.addAttribute("colors", colors);
        model.addAttribute("availabilities", availabilities);
        model.addAttribute("beerDto", new BeerDTO());

        return "/beer.jsp";
    }
}