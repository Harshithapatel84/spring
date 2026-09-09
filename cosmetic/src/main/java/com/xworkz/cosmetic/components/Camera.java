package com.xworkz.cosmetic.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
    private Light light;
    public Camera() {
        System.out.println("camera created");
    }

    @Autowired
    public void setLight(Light light) {
        System.out.println("light set in camera");
        this.light = light;
    }
}
