package com.xworkz.monitor.service;

import com.xworkz.monitor.dto.ProductDTO;

public interface ProductService {

    public  Boolean validateAndSave(ProductDTO productDTO);
}
