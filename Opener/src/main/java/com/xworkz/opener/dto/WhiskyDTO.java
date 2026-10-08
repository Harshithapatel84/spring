package com.xworkz.opener.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class WhiskyDTO {

    @NotBlank(message = "Whisky name cannot be blank")
    @Size(min = 3, max = 20, message = "Whisky name must be between 3 to 30 characters")
    private String name;

    @NotBlank(message = "Brand cannot be blank")
    @Size(min = 3, max = 30, message = "Brand must be between 3 to 30 characters")
    private String brand;

    @NotBlank(message = "Manufacturing company cannot be blank")
    @Size(min = 3, max = 30, message = "Manufacturing company must be between 3 to 30 characters")
    private String mfgCompany;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "Manufacturing date must be a previous date")
    private LocalDate mfgDate;

    @DecimalMin(value = "5", message = "Price must be at least 5")
    private double price;

    public WhiskyDTO() {
        System.out.println("WhiskyDTO created");
    }
}