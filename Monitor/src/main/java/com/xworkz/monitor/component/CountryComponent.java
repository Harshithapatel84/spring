package com.xworkz.monitor.component;


import com.xworkz.monitor.dto.CountryDTO;
import com.xworkz.monitor.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Component
@RequestMapping("/")
public class CountryComponent {

    public CountryComponent() {
        System.out.println("CountryComponent is created");
    }

    @Autowired
    CountryService countryService;

    @RequestMapping("/country")
    public String showData(@Valid CountryDTO countryDTO, BindingResult bindingResult, Model model)
    {
        System.out.println("running country in countryComponent");
        System.out.println("countryDTO="+countryDTO);

        if (bindingResult.hasErrors()) {
            System.out.println("there are validation errors,fix it");
            List<ObjectError>  errors=bindingResult.getAllErrors();
            model.addAttribute("validationErrors",errors);
            model.addAttribute("countryDto", countryDTO);
        }
        else{
            System.out.println("no validation error continue to execute");
            model.addAttribute("message","country details saved");
            model.addAttribute("countryDto",new CountryDTO());
        }

        return "/country.jsp";
    }
}
