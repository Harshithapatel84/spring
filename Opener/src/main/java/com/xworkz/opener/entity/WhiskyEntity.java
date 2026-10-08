package com.xworkz.opener.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "whisky")
public class WhiskyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String brand;
    private String mfgCompany;
    private LocalDate mfgDate;
    private double price;

    public WhiskyEntity() {
        System.out.println("WhiskyEntity created");
    }
}