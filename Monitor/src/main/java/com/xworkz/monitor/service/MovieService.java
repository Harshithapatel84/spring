package com.xworkz.monitor.service;

import com.xworkz.monitor.dto.MovieDTO;

public interface MovieService {
    public Boolean validateAndSave(MovieDTO movieDTO);
}
