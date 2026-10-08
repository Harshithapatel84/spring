package com.xworkz.opener.repo.impl;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.repo.WineRepository;
import org.springframework.stereotype.Component;

@Component
public class WineRepositoryImpl implements WineRepository {


    @Override
    public void save(WineDTO wineDTO) {
        System.out.println("running validateAndSave in WineRepositoryImpl ");
    }
}
