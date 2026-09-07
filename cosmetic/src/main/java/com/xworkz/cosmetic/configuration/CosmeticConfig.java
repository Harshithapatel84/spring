package com.xworkz.cosmetic.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.cosmetic")
public class CosmeticConfig {
    public CosmeticConfig(){
        System.out.println("cosmetic config");
    }
}
