package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.WeatherDTO;
import com.xworkz.monitor.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import javax.xml.ws.BindingType;

@Component
@RequestMapping("/")
public class WeatherComponent {

    public WeatherComponent(){
        System.out.println("weather component created");
    }

    @Autowired
    private WeatherService weatherService;
@RequestMapping("/weather")
    public String check(@Valid WeatherDTO weatherDTO , BindingResult bindingResult){
        System.out.println("running weather in component");
    System.out.println("weatherDto:"+weatherDTO);
    if(!bindingResult.hasErrors()){
        System.out.println("no validation error,continue to execute");
        weatherService.validateAndSave(weatherDTO);
    }
    else {
        System.out.println("there are validation errors");
    }

        return "/weather.jsp";
    }
}
