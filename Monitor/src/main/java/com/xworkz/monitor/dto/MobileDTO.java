package com.xworkz.monitor.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MobileDTO {

    private String brand;
    private String model;
    private Double price;
    private String storage;
    private String color;

    public MobileDTO() {
        System.out.println("MobileDTO is created");
    }
}