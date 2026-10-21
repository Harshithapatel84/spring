package com.xworkz.inventory.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class InventoryDTO {

   @NotBlank(message = "name cannot be blank")
    private  String  name;

   @NotBlank(message = "enter a valid email")
    private String email;


    private Long phNo;

    @NotBlank
    private String password;

    public InventoryDTO() {
        System.out.println("InventoryDTO created");
    }
}
