package com.xworkz.inventory.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "inventory")
public class InventoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phNo")
    private Long phNo;

    @Column(name = "password")
    private String password;

    public InventoryEntity() {
        System.out.println("InventoryEntity created");
    }
}