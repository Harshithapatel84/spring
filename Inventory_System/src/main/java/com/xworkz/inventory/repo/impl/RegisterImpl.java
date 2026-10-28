package com.xworkz.inventory.repo.impl;

import com.xworkz.inventory.entity.AuditEntity;
import com.xworkz.inventory.entity.RegisterEntity;
import com.xworkz.inventory.repo.RegisterRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

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
        AuditEntity auditEntity = new AuditEntity();
        auditEntity.setCreatedBy(registerEntity.getName()+" "+registerEntity.getEmail());
        auditEntity.setCreatedAt(LocalDateTime.now());
        auditEntity.setRegister(registerEntity);
        registerEntity.setAudit(auditEntity);
        entityManager.persist(registerEntity);
        System.out.println("Data saved to DB: " + registerEntity.getName());
    }

    @Override
    public boolean isEmailExist(String email) {
        Query query = entityManager.createNamedQuery("getmailId");
        query.setParameter("email", email);
        return !query.getResultList().isEmpty();
    }

    @Override
    public RegisterEntity findEntityByEmail(String email) {
        RegisterEntity entity = null;
        try {
            entity = (RegisterEntity) entityManager
                    .createNamedQuery("getmailId")
                    .setParameter("email", email)
                    .getSingleResult();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return entity;
    }

}
