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
@NamedQuery(name="getmailId",query="select e from InventoryEntity e where e.email=:email")
public class InventoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name",nullable=false,length=50)
    private String name;

    @Column(name = "email",nullable=false,unique = true, length = 30)
    private String email;

    @Column(name = "phNo",nullable = false,unique = true,length = 10)
    private Long phNo;

    @Column(name = "password",nullable = false,length = 20)
    private String password;

    public InventoryEntity() {
        System.out.println("InventoryEntity created");
    }
}