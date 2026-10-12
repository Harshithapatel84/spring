package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.WineRepository;
import com.xworkz.opener.service.WineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Transactional
@Service
public class WineServiceImpl implements WineService {

    @Autowired
    private WineRepository wineRepository;

    @Override
    public boolean validateAndSave(WineDTO wineDTO) {
        System.out.println("validateAndSave wine details");

        if (wineDTO != null) {
            System.out.println("converting wineDTO to WineEntity");
            WineEntity wineEntity = new WineEntity();
            BeanUtils.copyProperties(wineDTO, wineEntity);
            this.wineRepository.save(wineEntity);
            return true;
        }
        return false;
    }


    @Override
    public List<WineDTO> findAll() {
        System.out.println("findAll method is in service");
        List<WineEntity> entities = this.wineRepository.findAll();
        if (!entities.isEmpty()) {
            System.out.println("converting entities to DTO");
            return entities.stream()
                    .map(entity -> {
                        WineDTO wineDTO = new WineDTO();
                        BeanUtils.copyProperties(entity, wineDTO);
                        return wineDTO;
                    })
                    .collect(Collectors.toList());
        }
        System.out.println("No entities exist");
        return Collections.emptyList();
    }


    @Override
    public WineDTO findById(int id) {
        System.out.println("running id in service");
        if (id > 0) {
            System.out.println("id is positive, invoke repository");
            Optional<WineEntity> optional = this.wineRepository.findById(id);
            if (optional.isPresent()) {
                WineEntity wineEntity = optional.get();
                WineDTO wineDTO = new WineDTO();
                BeanUtils.copyProperties(wineEntity, wineDTO);
                return wineDTO;
            }
        }
        System.out.println("id is not positive / data is not there");
        return null;
    }
}


