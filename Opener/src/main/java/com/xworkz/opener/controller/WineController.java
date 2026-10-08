package com.xworkz.opener.controller;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.service.WineService;
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
@RequestMapping("/wine")
public class WineController {

    public WineController()
    {
        System.out.println("WineController created");
    }

    @Autowired
    WineService wineService;

    @PostMapping
    public String display(@Valid WineDTO wineDTO, BindingResult bindingResult, Model model){
        System.out.println("running wine in wineController");
        System.out.println("wineDto:"+wineDTO);

        if(bindingResult.hasErrors()){
            System.out.println("there are validation errors,fix it");
            List<ObjectError> errors=bindingResult.getAllErrors();
            model.addAttribute("validationErrors",errors);
            model.addAttribute("wineDto", wineDTO);
        }
        else{
            System.out.println("no validation error continue");

            System.out.println(wineDTO);
            this.wineService.validateAndSave(wineDTO);
            model.addAttribute("message","wine details saved");
            model.addAttribute("wineDto",new WineDTO());

        }
        return "/wine.jsp";
    }

    @GetMapping
    public String showWine(Model model) {
        System.out.println("Running showWine in WineController");
        model.addAttribute("wineDto", new WineDTO());
        return "/wine.jsp";
    }

}
