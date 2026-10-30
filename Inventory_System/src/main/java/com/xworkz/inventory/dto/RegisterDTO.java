
package com.xworkz.inventory.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class RegisterDTO {

    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Please enter a valid email address")
    private String email;

    @NotBlank(message = "Phone number cannot be blank")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must contain exactly 10 digits")
    private String phNo;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, message = "Password must contain at least 8 characters")
    private String password;

    public RegisterDTO() {
        System.out.println("InventoryDTO created");
    }
}
