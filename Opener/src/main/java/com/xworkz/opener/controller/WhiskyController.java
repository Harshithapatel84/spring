package com.xworkz.opener.controller;

import com.xworkz.opener.dto.WhiskyDTO;
import com.xworkz.opener.service.WhiskyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/whisky")
public class WhiskyController {

    public WhiskyController() {
        System.out.println("WhiskyController created");
    }

    @Autowired
    WhiskyService whiskyService;

    @PostMapping
    public String display(@Valid WhiskyDTO whiskyDTO, BindingResult bindingResult, Model model) {

        System.out.println("running whisky in WhiskyController");
        System.out.println("whiskyDto: " + whiskyDTO);
        if (bindingResult.hasErrors()) {

            System.out.println("there are validation errors, fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("whiskyDto", whiskyDTO);

        } else {
            System.out.println("no validation error continue");
            this.whiskyService.validateAndSave(whiskyDTO);
            model.addAttribute("message", "whisky details saved");
            model.addAttribute("whiskyDto", new WhiskyDTO());
        }
        return "/whisky.jsp";
    }

    @GetMapping
    public String showWhisky(Model model) {
        System.out.println("Running showWhisky in WhiskyController");
        model.addAttribute("whiskyDto", new WhiskyDTO());
        return "/whisky.jsp";
    }
}