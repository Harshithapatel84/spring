
package com.xworkz.opener.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.opener")
public class ApplicationConfig {

    public ApplicationConfig() {
        System.out.println("ApplicationConfig created");
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
