package com.xworkz.monitor.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CameraDTO {

    private String brand;
    private String model;
    private Double price;
    private String type;
    private String resolution;

    public CameraDTO() {
        System.out.println("CameraDTO is created");
    }
}