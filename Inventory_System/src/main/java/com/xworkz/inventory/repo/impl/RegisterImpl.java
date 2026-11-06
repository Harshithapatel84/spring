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

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

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
            RegisterEntity entity = entityManager.find(RegisterEntity.class, registerEntity.getId());

            if (entity != null) {

                entity.setName(registerEntity.getName());
                entity.setEmail(registerEntity.getEmail());
                entity.setPhNo(registerEntity.getPhNo());

                if (registerEntity.getPassword() != null && !registerEntity.getPassword().isEmpty()) {
                    entity.setPassword(registerEntity.getPassword());
                }

                if (registerEntity.getImageName() != null) {
                    entity.setImageName(registerEntity.getImageName());
                }

                AuditEntity auditEntity = entity.getAudit();

                if (auditEntity != null) {
                    auditEntity.setUpdatedBy(registerEntity.getName() + " " + registerEntity.getEmail());
                    auditEntity.setUpdatedAt(LocalDateTime.now());
                }

                updatedEntity = entity;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return updatedEntity;
    }
    @Override
    public Boolean saveOtp(String email, String otp) {
       EntityManager m=entityManagerFactory.createEntityManager();
       EntityTransaction transaction=m.getTransaction();
       try{
           transaction.begin();
           int result=m.createNamedQuery("updateOtpByEmail").setParameter("email",email).setParameter("otp",otp).executeUpdate();
           transaction.commit();
           if (result>0){
          return true;
      }

       }catch (PersistenceException e){

       }finally{
           m.close();
       }
       return false;
    }

}
