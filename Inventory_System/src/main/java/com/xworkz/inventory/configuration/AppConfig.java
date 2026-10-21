package com.xworkz.inventory.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import org.springframework.context.annotation.Bean;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.inventory")
public class AppConfig {

    public AppConfig() {
        System.out.println("Application configuration created");
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        System.out.println("running internalResourceViewResolver");

        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();

        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}