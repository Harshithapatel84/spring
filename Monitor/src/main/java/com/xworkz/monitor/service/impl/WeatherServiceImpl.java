package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.WeatherDTO;
import com.xworkz.monitor.service.WeatherService;
import org.springframework.stereotype.Component;

@Component
public class WeatherServiceImpl implements WeatherService {
    @Override
    public boolean validateAndSave(WeatherDTO weatherDTO) {
        System.out.println("validateAndSave in weatherServiceImpl");
        return true;
    }
}
