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
@Table(name = "vodka")
public class VodkaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String mfgAddress;
    private double price;
    private String brand;
    private String flavour;
    private String alcoholPercentage;

    public VodkaEntity() {
        System.out.println("VodkaEntity created");
    }
}