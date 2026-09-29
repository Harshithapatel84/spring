package com.xworkz.monitor.service;

import com.xworkz.monitor.dto.WeatherDTO;

public interface WeatherService {
    public boolean validateAndSave(WeatherDTO weatherDTO);
}
