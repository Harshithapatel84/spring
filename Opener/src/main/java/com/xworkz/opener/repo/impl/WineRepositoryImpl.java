package com.xworkz.opener.repo.impl;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.WineRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class WineRepositoryImpl implements WineRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(WineEntity wineEntity) {
        System.out.println("running Save method in WineRepositoryImpl ");
        entityManager.persist(wineEntity);

    }
}
