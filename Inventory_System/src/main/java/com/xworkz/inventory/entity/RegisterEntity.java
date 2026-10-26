
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
@NamedQuery(name = "getmailId", query = "select e from RegisterEntity e where e.email = :email")
public class RegisterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "phNo", nullable = false, unique = true, length = 10)
    private String phNo;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    public RegisterEntity() {
        System.out.println("InventoryEntity created");
    }
}
