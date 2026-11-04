package com.xworkz.inventory.util;

import java.security.SecureRandom;

public class InventoryUtil {
    public  static String IMAGE_PATH="C:\\Users\\WIN\\Desktop\\inventory\\images";

public static String generateOtp(){
    SecureRandom random=new SecureRandom() ;
        int otp = 100000 + random.nextInt(90000);
        return String.valueOf(otp);
    }
}

