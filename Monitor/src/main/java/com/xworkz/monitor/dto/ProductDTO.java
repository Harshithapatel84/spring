package com.xworkz.monitor.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {

    private String productName;
    private String brand;
    private String category;
    private Double price;
    private String availability;

    public ProductDTO() {
        System.out.println("ProductDTO is created");
    }
}