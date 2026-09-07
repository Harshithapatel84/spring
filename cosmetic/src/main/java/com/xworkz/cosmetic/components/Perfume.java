package com.xworkz.cosmetic.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Perfume {

    private Glass glass;
    private Paint paint;
    public Perfume(){
        System.out.println("Perfume created");
    }
@Autowired
    public void setGlass(Glass glass) {
        System.out.println("setting glass in perfume");
        this.glass = glass;
    }
@Autowired
    public void setPaint(Paint paint) {
        System.out.println("setting paint in perfume");
        this.paint = paint;
    }
}
