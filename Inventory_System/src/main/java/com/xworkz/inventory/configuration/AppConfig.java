
package com.xworkz.inventory.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.inventory")
@PropertySource("classpath:application.properties")
@EnableWebMvc
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig created");
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        System.out.println("Running internalResourceViewResolver()");

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

public CommonsMultipartResolver multipartResolver()
{
    CommonsMultipartResolver resolver=new CommonsMultipartResolver();
    resolver.setMaxUploadSize(10*1024*1024);
    resolver.setMaxUploadSizePerFile(5*1024*1024);
    return  resolver;

}


}
