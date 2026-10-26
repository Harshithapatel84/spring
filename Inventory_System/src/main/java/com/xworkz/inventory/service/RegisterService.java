package com.xworkz.inventory.service;

import com.xworkz.inventory.dto.RegisterDTO;

public interface RegisterService {

public Boolean validateAndSave(RegisterDTO inventoryDTO);
}
