package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.ContactDTO;
import com.xworkz.monitor.service.ContactService;
import org.springframework.stereotype.Component;

@Component
public class ContactServiceImpl implements ContactService {

    public ContactServiceImpl(){
        System.out.println("ContactServiceImpl started");

    }

    @Override
    public Boolean validateAndSave(ContactDTO contactDTO) {
        System.out.println("validateandsave ContactServiceImpl");
        return true;
    }
}
