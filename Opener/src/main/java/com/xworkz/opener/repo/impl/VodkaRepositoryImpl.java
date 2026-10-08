package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.VodkaEntity;
import com.xworkz.opener.repo.VodkaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class VodkaRepositoryImpl implements VodkaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(VodkaEntity vodkaEntity) {
        System.out.println("running Save method in VodkaRepositoryImpl");
        entityManager.persist(vodkaEntity);
    }
}