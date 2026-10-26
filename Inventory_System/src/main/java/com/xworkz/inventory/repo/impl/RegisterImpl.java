package com.xworkz.inventory.repo.impl;

import com.xworkz.inventory.entity.RegisterEntity;
import com.xworkz.inventory.repo.RegisterRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class RegisterImpl implements RegisterRepo {

    @PersistenceContext
    private EntityManager em;

    public RegisterImpl() {
        System.out.println("InventoryImpl object created");
    }

    @Override
    @Transactional
    public void save(RegisterEntity registerEntity) {
        System.out.println("Running inventory repo in impl");
        em.persist(registerEntity);
        System.out.println("Inventory details saved");
    }
}