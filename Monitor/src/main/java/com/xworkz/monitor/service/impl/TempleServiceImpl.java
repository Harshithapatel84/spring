package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.TempleDTO;
import com.xworkz.monitor.service.TempleService;
import org.springframework.stereotype.Component;

@Component
public class TempleServiceImpl implements TempleService {

    public  TempleServiceImpl(){
        System.out.println("temple service started");
    }
    @Override
    public Boolean validateAndSave(TempleDTO templeDTO) {
        System.out.println("validateandsave templeServiceImpl");
        return true;
    }
}
