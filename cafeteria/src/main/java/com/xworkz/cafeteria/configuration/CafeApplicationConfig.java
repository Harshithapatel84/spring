package com.xworkz.cafeteria.configuration;


import com.xworkz.cafeteria.component.Cheetha;
import com.xworkz.cafeteria.component.Cloud;
import com.xworkz.cafeteria.component.Throne;
import org.springframework.context.annotation.Bean;
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

    @Bean
   public Throne throne(){
        Throne throne=new Throne();
       System.out.println("registering throne using bean");
       return throne;
   }

   @Bean
    public Cloud Darkcloud(){
        Cloud cloud=new Cloud();
       System.out.println("registering cloud");
       return cloud;
   }

   @Bean
   public Cloud DryCloud(){
        Cloud cloud=new Cloud();
       System.out.println("registering dry cloud");
       return cloud;
   }

   @Bean
   public String name()
   {
       System.out.println("registering name");
       return "diya";
   }
@Bean
   public String email()
   {
       System.out.println("registering email");
       return "abc@gmail.com";
   }

@Bean
   public Long mobileNumber(){
       System.out.println("registering mobile number");
       return 8431567243L;
   }
}
