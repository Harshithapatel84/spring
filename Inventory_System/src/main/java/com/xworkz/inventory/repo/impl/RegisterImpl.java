package com.xworkz.inventory.repo.impl;

import com.xworkz.inventory.entity.RegisterEntity;
import com.xworkz.inventory.repo.RegisterRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
public class RegisterImpl implements RegisterRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public RegisterImpl() {
        System.out.println("InventoryImpl object created");
    }

    @Override
    @Transactional
    public void save(RegisterEntity registerEntity) {
        System.out.println("Running inventory repo in impl");
        entityManager.persist(registerEntity);
        System.out.println("Inventory details saved");
    }

    @Override
    public boolean isEmailExist(String email) {
        Query query = entityManager.createNamedQuery("getmailId");
        query.setParameter("email", email);
        return !query.getResultList().isEmpty();
    }

    }
