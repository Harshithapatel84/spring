package com.xworkz.opener.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class WineDTO {

    @NotBlank(message = "company name cannot be blank")
    private String companyName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "Manufacturing date must be a previous date")
    private LocalDate mfgDate;

    @NotBlank
    @Size(min = 3,max = 30,message = "manf aname is between 3 to 30 characters")
    private String mfgName;

    @DecimalMin(value = "0.1", message = "Age must be at least 0.1 years") @DecimalMax(value = "2500", message = "Age must not exceed 2500 years")
    private double age;

    public WineDTO()
    {
        System.out.println("WineDTO created");
    }
}
