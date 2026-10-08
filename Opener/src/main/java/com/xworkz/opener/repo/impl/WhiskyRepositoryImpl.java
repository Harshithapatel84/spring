package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.WhiskyEntity;
import com.xworkz.opener.repo.WhiskyRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class WhiskyRepositoryImpl implements WhiskyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(WhiskyEntity whiskyEntity) {

        System.out.println("running Save method in WhiskyRepositoryImpl ");

        entityManager.persist(whiskyEntity);
    }
}