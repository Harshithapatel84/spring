package com.xworkz.inventory.service.impl;

import com.xworkz.inventory.dto.RegisterDTO;
import com.xworkz.inventory.entity.RegisterEntity;
import com.xworkz.inventory.repo.RegisterRepo;
import com.xworkz.inventory.service.RegisterService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterRepo registerRepo;

    @Override
    public Boolean validateAndSave(RegisterDTO inventoryDTO) {
        System.out.println("running inventoryService in cerviceImpl");
        if (inventoryDTO!=null)
        {
            System.out.println("converting dto to entity");
            RegisterEntity registerEntity = new RegisterEntity();
            BeanUtils.copyProperties(inventoryDTO, registerEntity);
            this.registerRepo.save(registerEntity);
            return true;
        }
        return false;
    }

    @Override
    public Boolean emailExist(String email) {

            return registerRepo.isEmailExist(email);
        }

    }

