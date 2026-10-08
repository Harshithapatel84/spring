package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.repo.WineRepository;
import com.xworkz.opener.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Service
public class WineServiceImpl implements WineService {

    @Autowired
    private WineRepository wineRepository;
    @Override
    public boolean validateAndSave(WineDTO wineDTO) {
        System.out.println("validateAndSave wine details");

        if(wineDTO!=null)
        {
            this.wineRepository.save(wineDTO);
            return true;
        }
        return false;
    }
}
