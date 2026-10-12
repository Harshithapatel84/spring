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
import org.springframework.web.bind.annotation.RequestParam;

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
        return "wine";
    }

    @GetMapping
    public String showWine(Model model) {
        System.out.println("Running showWine in WineController");
        model.addAttribute("wineDto", new WineDTO());
        return "wine";
    }

    @GetMapping("/readAll")
    public String showAll(Model model) {
        System.out.println("running showAll in wineComponent");
        List<WineDTO> wineDTOList=this.wineService.findAll();
        model.addAttribute("wineDTOList",wineDTOList);
        return "wineDisplay";
    }


    @GetMapping("/editWine")
    public String editWine(Model model, @RequestParam int id) {
        System.out.println("running editWine in wineComponent");
        System.out.println("id to edit: " + id);
        WineDTO wineDTO = this.wineService.findById(id);
        if (wineDTO != null) {
            model.addAttribute("wineDto", wineDTO);
        } else {
            model.addAttribute("error", "No wine found with id: " + id);
        }
        return "wine";
    }


}
