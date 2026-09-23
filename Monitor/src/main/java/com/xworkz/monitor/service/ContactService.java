package com.xworkz.monitor.service;

import com.xworkz.monitor.dto.ContactDTO;

public interface ContactService {
    public  Boolean validateAndSave(ContactDTO contactDTO);
}
