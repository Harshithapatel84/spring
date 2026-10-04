package com.xworkz.monitor.repo;

import com.xworkz.monitor.dto.CountryDTO;

public interface CountryRepo {

    public void  validateAndSave(CountryDTO countryDTO);
}
