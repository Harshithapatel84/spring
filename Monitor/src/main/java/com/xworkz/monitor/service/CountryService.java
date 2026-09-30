package com.xworkz.monitor.service;

import com.xworkz.monitor.dto.CountryDTO;

public interface CountryService {

    public boolean validateAndSave(CountryDTO countryDTO);
}
