package com.xworkz.opener.service;

import com.xworkz.opener.dto.BeerDTO;
import com.xworkz.opener.dto.VodkaDTO;

public interface BeerService {

    public boolean validateAndSave(BeerDTO beerDTO);
}
