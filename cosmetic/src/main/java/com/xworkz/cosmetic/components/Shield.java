package com.xworkz.cosmetic.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shield {
    private Paint paint;
    public Shield() {
        System.out.println("Shield created");
    }

    @Autowired
    public void setPaint(Paint paint) {
        System.out.println("Shield set paint");
        this.paint = paint;
    }
}
