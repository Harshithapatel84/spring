package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.BeerDTO;
import com.xworkz.opener.entity.BeerEntity;
import com.xworkz.opener.repo.BeerRepository;
import com.xworkz.opener.service.BeerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class BeerServiceImpl implements BeerService {

    @Autowired
    private BeerRepository beerRepository;

    @Override
    public boolean validateAndSave(BeerDTO beerDTO) {
        System.out.println("validateAndSave beer details");
        if (beerDTO != null) {
            System.out.println("converting beerDTO to BeerEntity");
            BeerEntity beerEntity = new BeerEntity();
            BeanUtils.copyProperties(beerDTO, beerEntity);
            this.beerRepository.save(beerEntity);
            return true;
        }

        return false;
    }
}