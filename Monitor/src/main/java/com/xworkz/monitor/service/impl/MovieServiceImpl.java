package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.MovieDTO;
import com.xworkz.monitor.service.MovieService;
import org.springframework.stereotype.Component;

@Component
public class MovieServiceImpl implements MovieService {

    public MovieServiceImpl() {
        System.out.println("MovieServiceImple started");
    }


    @Override
    public Boolean validateAndSave(MovieDTO movieDTO) {
        System.out.println("validate and save MovieerviceImpl");
        return true;
    }
}
