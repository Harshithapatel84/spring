package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.WhiskyDTO;
import com.xworkz.opener.entity.WhiskyEntity;
import com.xworkz.opener.repo.WhiskyRepository;
import com.xworkz.opener.service.WhiskyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class WhiskyServiceImpl implements WhiskyService {

    @Autowired
    private WhiskyRepository whiskyRepository;

    @Override
    public boolean validateAndSave(WhiskyDTO whiskyDTO) {

        System.out.println("validateAndSave whisky details");

        if (whiskyDTO != null) {

            System.out.println("converting whiskyDTO to WhiskyEntity");

            WhiskyEntity whiskyEntity = new WhiskyEntity();

            BeanUtils.copyProperties(whiskyDTO, whiskyEntity);

            this.whiskyRepository.save(whiskyEntity);

            return true;
        }

        return false;
    }
}