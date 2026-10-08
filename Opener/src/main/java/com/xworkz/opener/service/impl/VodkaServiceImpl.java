package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.VodkaDTO;
import com.xworkz.opener.entity.VodkaEntity;
import com.xworkz.opener.repo.VodkaRepository;
import com.xworkz.opener.service.VodkaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class VodkaServiceImpl implements VodkaService {

    @Autowired
    private VodkaRepository vodkaRepository;

    @Override
    public boolean validateAndSave(VodkaDTO vodkaDTO) {
        System.out.println("validateAndSave vodka details");
        if (vodkaDTO != null) {
            System.out.println("converting vodkaDTO to VodkaEntity");
            VodkaEntity vodkaEntity = new VodkaEntity();
            BeanUtils.copyProperties(vodkaDTO, vodkaEntity);
            this.vodkaRepository.save(vodkaEntity);
            return true;
        }

        return false;
    }
}