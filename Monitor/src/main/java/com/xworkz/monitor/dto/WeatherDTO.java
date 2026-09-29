package com.xworkz.monitor.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Data
public class WeatherDTO {

    @NotNull
    @Size(min = 3, max = 30)
    private String city;

    @NotNull
    @Size(min = 5, max = 30)
    private String area;


    private boolean raining;

public WeatherDTO()
{
    System.out.println("weatherDto created");
}
}
