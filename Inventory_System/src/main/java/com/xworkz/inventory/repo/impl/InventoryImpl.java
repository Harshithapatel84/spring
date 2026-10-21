package com.xworkz.inventory.repo.impl;

import com.xworkz.inventory.entity.InventoryEntity;
import com.xworkz.inventory.repo.InventoryRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class InventoryImpl implements InventoryRepo {

    @PersistenceContext
    private EntityManager em;

    public InventoryImpl() {
        System.out.println("InventoryImpl object created");
    }

    @Override
    @Transactional
    public void save(InventoryEntity inventoryEntity) {
        System.out.println("Running inventory repo in impl");
        em.persist(inventoryEntity);
        System.out.println("Inventory details saved");
    }
}