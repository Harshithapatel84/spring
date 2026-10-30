package com.xworkz.inventory.repo.impl;

import com.xworkz.inventory.entity.AuditEntity;
import com.xworkz.inventory.entity.RegisterEntity;
import com.xworkz.inventory.repo.RegisterRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Repository
public class RegisterImpl implements RegisterRepo {

    @PersistenceContext
    private EntityManager entityManager;

//    @PersistenceUnit
//    private EntityManagerFactory emf=null;

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

    @Override
    public RegisterEntity findById(Long id) {

        RegisterEntity entity = null;

        try {
            entity = entityManager.find(RegisterEntity.class, id);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return entity;
    }

    @Override
    @Transactional
    public RegisterEntity update(RegisterEntity registerEntity) {

        RegisterEntity updatedEntity = null;

        try {
            RegisterEntity entity = entityManager.find(
                    RegisterEntity.class, registerEntity.getId()
            );

            if (entity != null) {

                entity.setName(registerEntity.getName());
                entity.setEmail(registerEntity.getEmail());
                entity.setPhNo(registerEntity.getPhNo());
                entity.setPassword(registerEntity.getPassword());

                AuditEntity auditEntity = entity.getAudit();

                auditEntity.setUpdatedBy(
                        registerEntity.getName() + " " + registerEntity.getEmail()
                );

                auditEntity.setUpdatedAt(LocalDateTime.now());

                updatedEntity = entity;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return updatedEntity;
    }

}
