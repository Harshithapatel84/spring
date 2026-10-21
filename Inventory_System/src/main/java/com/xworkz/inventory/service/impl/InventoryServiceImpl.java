package com.xworkz.inventory.service.impl;

import com.xworkz.inventory.dto.InventoryDTO;
import com.xworkz.inventory.entity.InventoryEntity;
import com.xworkz.inventory.repo.InventoryRepo;
import com.xworkz.inventory.repo.impl.InventoryImpl;
import com.xworkz.inventory.service.InventoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepo inventoryRepo;

    @Override
    public Boolean validateAndSave(InventoryDTO inventoryDTO) {
        System.out.println("running inventoryService in cerviceImpl");
        if (inventoryDTO!=null)
        {
            System.out.println("converting dto to entity");
            InventoryEntity inventoryEntity = new InventoryEntity();
            BeanUtils.copyProperties(inventoryDTO,inventoryEntity);
            this.inventoryRepo.save(inventoryEntity);
            return true;
        }
        return false;
    }
}
