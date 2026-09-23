package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.MobileDTO;
import com.xworkz.monitor.dto.MovieDTO;
import com.xworkz.monitor.service.MobileService;
import org.springframework.stereotype.Component;

@Component
public class MObileServiceImpl implements MobileService {

    public  MObileServiceImpl(){
        System.out.println("MObileServiceImpl started");
    }
    @Override
    public Boolean ValidateAndSave(MobileDTO mobileDTO) {
        System.out.println("validate and save MobileServiceImpl");
        return true;
    }
}
