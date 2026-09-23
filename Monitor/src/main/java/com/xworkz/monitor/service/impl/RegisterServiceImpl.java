package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.RegisterDTO;
import com.xworkz.monitor.service.RegisterService;
import org.springframework.stereotype.Component;

@Component
public class RegisterServiceImpl implements RegisterService {

    public  RegisterServiceImpl(){
        System.out.println("RegisterService started");
    }
    @Override
    public Boolean validateAmdSave(RegisterDTO registerDTO) {
        System.out.println("validate And save the register details");

        return true;
    }
}
