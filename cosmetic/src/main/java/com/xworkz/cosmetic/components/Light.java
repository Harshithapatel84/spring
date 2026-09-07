package com.xworkz.cosmetic.components;

import org.springframework.stereotype.Component;

@Component
public class Light {
    private Marker marker;
    public Light(){
        System.out.println("Light created");
    }

    public void setMarker(Marker marker) {
        System.out.println("Light set marker"  );
        this.marker = marker;
    }
}
