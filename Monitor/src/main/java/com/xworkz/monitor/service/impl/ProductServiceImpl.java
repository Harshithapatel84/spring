package com.xworkz.monitor.service.impl;

import com.xworkz.monitor.dto.ProductDTO;
import com.xworkz.monitor.service.ProductService;

public class ProductServiceImpl implements ProductService {

    public  ProductServiceImpl()
    {
        System.out.println("productServiceImple started");
    }
    @Override
    public Boolean validateAndSave(ProductDTO productDTO) {
        System.out.println("validateand Save productImpl");
        return true;
    }
}

