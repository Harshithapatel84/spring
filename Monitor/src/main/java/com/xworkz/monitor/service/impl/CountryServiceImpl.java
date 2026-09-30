package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.CountryDTO;
import com.xworkz.monitor.service.CountryService;
import org.springframework.stereotype.Component;

@Component
public class CountryServiceImpl implements CountryService {
    @Override
    public boolean validateAndSave(CountryDTO countryDTO) {
        System.out.println("validate And Saving the country serviceImpl");
        return true;
    }
}
