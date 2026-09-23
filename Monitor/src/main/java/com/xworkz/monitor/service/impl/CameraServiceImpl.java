package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.CameraDTO;
import com.xworkz.monitor.service.CameraService;
import org.springframework.stereotype.Component;

@Component
public class CameraServiceImpl implements CameraService {
    @Override
    public Boolean validateAndSave(CameraDTO cameraDTO) {
        System.out.println("validate and save CameraServiceImpl");
        return true;
    }
}
