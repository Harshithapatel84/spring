package com.xworkz.monitor.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.monitor")
public class ApplicationConfig {
    public ApplicationConfig(){
        System.out.println("application Config is created");
    }
}
