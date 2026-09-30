package com.xworkz.monitor.dto;


import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CountryDTO {
    @NotBlank
    private String code;
    @NotBlank
    @Size(min = 5, max = 30,message = "country name must be between 5 to 30 characters")
    private String name;
    @NotBlank
    private String language;
    @Min(value = 5,message = "states min 5")
    private int noOfState;
    private long population;
    @NotBlank
    private String capital;

    public CountryDTO(){
        System.out.println("countryDto created");
    }

}
