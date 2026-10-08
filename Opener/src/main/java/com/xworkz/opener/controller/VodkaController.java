package com.xworkz.opener.controller;

import com.xworkz.opener.dto.VodkaDTO;
import com.xworkz.opener.service.VodkaService;
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
public class VodkaController {

    private List<String> brands;
    private List<String> flavours;
    private List<String> alcoholPercentages;

    public VodkaController() {
        System.out.println("VodkaController is created");
    }

    @PostConstruct
    public void onInit() {

        System.out.println("running onInit");

        brands = Stream.of("Absolut", "Smirnoff", "Grey Goose", "Belvedere").collect(Collectors.toList());

        flavours = Stream.of("Plain", "Lemon", "Orange", "Vanilla").collect(Collectors.toList());

        alcoholPercentages = Stream.of("37.5%", "40%", "42.5%", "45%").collect(Collectors.toList());
    }

    @Autowired
    VodkaService vodkaService;

    @PostMapping("/vodka")
    public String showData(@Valid VodkaDTO vodkaDTO, BindingResult bindingResult, Model model) {

        System.out.println("running vodka in VodkaController");
        System.out.println("vodkaDTO=" + vodkaDTO);
        if (bindingResult.hasErrors()) {

            System.out.println("there are validation errors, fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("vodkaDto", vodkaDTO);

        } else {

            System.out.println("no validation error continue to execute");
            this.vodkaService.validateAndSave(vodkaDTO);
            model.addAttribute("message", "vodka details saved");
            model.addAttribute("vodkaDto", new VodkaDTO());
        }
        model.addAttribute("brands", brands);
        model.addAttribute("flavours", flavours);
        model.addAttribute("alcoholPercentages", alcoholPercentages);

        return "/vodka.jsp";
    }

    @GetMapping("/vodka")
    public String showData(Model model) {

        System.out.println("running showData, loading vodka.jsp");
        model.addAttribute("brands", brands);
        model.addAttribute("flavours", flavours);
        model.addAttribute("alcoholPercentages", alcoholPercentages);
        model.addAttribute("vodkaDto", new VodkaDTO());
        return "/vodka.jsp";
    }
}