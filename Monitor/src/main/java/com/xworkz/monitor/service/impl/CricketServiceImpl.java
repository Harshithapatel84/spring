package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.CricketTeamDto;
import com.xworkz.monitor.service.CricketService;
import org.springframework.stereotype.Component;

@Component
public class CricketServiceImpl implements CricketService {

    public CricketServiceImpl() {
        System.out.println("CricketServiceImpl started");
    }
    @Override
    public Boolean validateAndSave(CricketTeamDto cricketTeamDto) {
        System.out.println("validate and save cricketServiceImpl");
        return true;
    }
}
