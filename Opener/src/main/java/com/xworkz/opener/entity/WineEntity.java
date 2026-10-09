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
@Table(name="wine")
@NamedQuery(name="findAll",query="from WineEntity")
public class WineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String companyName;
    private LocalDate mfgDate;
    private String mfgName;
    private double age;

    public WineEntity() {
        System.out.println("WineEntity created");
    }

}
