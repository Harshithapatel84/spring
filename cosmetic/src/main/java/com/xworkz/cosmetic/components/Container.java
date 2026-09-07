package com.xworkz.cosmetic.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Container {
    private Glass glass;
public Container(){
    System.out.println("container created");
}
@Autowired
    public void setGlass(Glass glass) {
        System.out.println("glass in container created");
        this.glass = glass;
    }
}
