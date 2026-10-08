package com.xworkz.opener.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "beer")
public class BeerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String brewery;
    private String type;
    private String color;
    private double alcoholPercentage;
    private String availability;

    public BeerEntity() {
        System.out.println("BeerEntity created");
    }
}