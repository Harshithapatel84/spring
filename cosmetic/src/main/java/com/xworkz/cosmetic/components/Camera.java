package com.xworkz.cosmetic.components;

import org.springframework.stereotype.Component;

@Component
public class Camera {
    private Light light;
    public Camera() {
        System.out.println("camera created");
    }

    public void setLight(Light light) {
        System.out.println("light set in camera");
        this.light = light;
    }
}
