package com.xworkz.monitor.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurator implements WebMvcConfigurer {

    public WebConfigurator() {
        System.out.println("web configurator created");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("running resource handler");
        registry.addResourceHandler("/images/**")
                .addResourceLocations("/resources/static/images/");
    }
}
