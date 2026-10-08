package com.xworkz.opener.dto;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class BeerDTO {

    @NotBlank(message = "Beer name cannot be blank")
    @Size(min = 3, max = 30, message = "Beer name must be between 3 to 30 characters")
    private String name;

    @NotBlank(message = "Brewery cannot be blank")
    @Size(min = 3, max = 50, message = "Brewery must be between 3 to 50 characters")
    private String brewery;

    @NotBlank(message = "Beer type must be selected")
    private String type;

    @NotBlank(message = "Color must be selected")
    private String color;

    @DecimalMin(value = "0.1", message = "Alcohol percentage must be at least 0.1")
    @DecimalMax(value = "20.0", message = "Alcohol percentage must not exceed 20")
    private double alcoholPercentage;

    @NotBlank(message = "Availability must be selected")
    private String availability;

    public BeerDTO() {
        System.out.println("BeerDTO created");
    }
}