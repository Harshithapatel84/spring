package com.xworkz.cafeteria.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cheetha {
    @Autowired
    private String email;

    public  Cheetha() {
        System.out.println("Cheetha created");
    }


}
