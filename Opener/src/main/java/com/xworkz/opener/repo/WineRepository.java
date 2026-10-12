package com.xworkz.opener.repo;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.entity.WineEntity;

import java.util.List;
import java.util.Optional;

public interface WineRepository {

    public void save(WineEntity wineEntity);

    List<WineEntity> findAll();

   Optional<WineEntity> findById(int  id);
}
