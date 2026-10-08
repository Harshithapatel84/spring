package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.BeerEntity;
import com.xworkz.opener.repo.BeerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BeerRepositoryImpl implements BeerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(BeerEntity beerEntity) {

        System.out.println("running Save method in BeerRepositoryImpl");

        entityManager.persist(beerEntity);
    }
}