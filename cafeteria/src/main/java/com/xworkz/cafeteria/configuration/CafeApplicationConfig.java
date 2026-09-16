package com.xworkz.cafeteria.configuration;


import com.xworkz.cafeteria.component.Cheetha;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.cafeteria")
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
