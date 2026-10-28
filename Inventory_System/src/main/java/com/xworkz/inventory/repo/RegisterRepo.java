package com.xworkz.inventory.repo;

import com.xworkz.inventory.entity.RegisterEntity;

public interface RegisterRepo {
    public void save(RegisterEntity registerEntity);

    boolean isEmailExist(String email);

    RegisterEntity findEntityByEmail(String email);
}
