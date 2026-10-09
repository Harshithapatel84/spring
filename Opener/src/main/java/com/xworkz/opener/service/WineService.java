package com.xworkz.opener.service;

import com.xworkz.opener.dto.WineDTO;

import java.util.List;

public interface WineService {
    public  boolean validateAndSave(WineDTO wineDTO);

    List<WineDTO> findAll();

}
