package com.xworkz.monitor.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TempleDTO {

    private String name;
    private String place;
    private String openingTime;
    private String closingTime;
    private Double ticketPrice;

    public TempleDTO() {
        System.out.println("TempleDTO is created");
    }
}