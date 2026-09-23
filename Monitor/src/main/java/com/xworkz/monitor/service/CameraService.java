package com.xworkz.monitor.service;

import com.xworkz.monitor.dto.CameraDTO;

public interface CameraService {

    public Boolean validateAndSave(CameraDTO cameraDTO);
}
