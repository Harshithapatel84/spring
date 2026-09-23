package com.xworkz.monitor.service;

import com.xworkz.monitor.dto.MobileDTO;
import com.xworkz.monitor.dto.MovieDTO;

public interface MobileService {
    public Boolean ValidateAndSave(MobileDTO mobileDTO);
}
