package com.xworkz.monitor.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterDTO {

    private String name;
    private Long phNumber;
    private String email;
    private String address;

    public RegisterDTO() {
        System.out.println("RegisterDto is created");
    }
}
