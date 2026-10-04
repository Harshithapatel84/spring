package com.xworkz.monitor.repo.impl;

import com.xworkz.monitor.dto.CountryDTO;
import com.xworkz.monitor.repo.CountryRepo;

public class CountryRepoImpl implements CountryRepo {
    @Override
    public void validateAndSave(CountryDTO countryDTO) {
        System.out.println("running validateAndSave in CountryRepoImpl");

    }
}
