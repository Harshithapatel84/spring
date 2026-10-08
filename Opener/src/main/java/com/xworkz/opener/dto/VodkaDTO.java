package com.xworkz.opener.dto;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class VodkaDTO {

    @NotBlank(message = "Vodka name cannot be blank")
    @Size(min = 3, max = 30, message = "Name must be between 3 to 30 characters")
    private String name;

    @NotBlank(message = "Manufacturing address cannot be blank")
    @Size(min = 5, max = 100, message = "Manufacturing address must be between 5 to 100 characters")
    private String mfgAddress;

    @DecimalMin(value = "1.0", message = "Price must be at least 1")
    private double price;

    @NotBlank(message = "Brand must be selected")
    private String brand;

    @NotBlank(message = "Flavour must be selected")
    private String flavour;

    @NotBlank(message = "Alcohol percentage must be selected")
    private String alcoholPercentage;

    public VodkaDTO() {
        System.out.println("VodkaDTO created");
    }
}