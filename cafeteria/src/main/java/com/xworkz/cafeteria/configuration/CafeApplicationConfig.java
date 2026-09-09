package com.xworkz.cafeteria.configuration;


import com.xworkz.cafeteria.component.Cheetha;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CafeApplicationConfig {

    public CafeApplicationConfig(){
        System.out.println("cafeteria system Config");
    }

    public Cheetha cheetha()
    {
        Cheetha cheetha = new Cheetha();
        System.out.println("cheetha  Config redefined");
        return cheetha;
    }
}
