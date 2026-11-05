package com.xworkz.inventory.service.impl;

import com.xworkz.inventory.configuration.EmailConfig;
import com.xworkz.inventory.service.EmailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    private final EmailConfig emailConfig;

    public EmailServiceImpl(EmailConfig emailConfig) {
        this.emailConfig = emailConfig;
    }

    @Override
    public Boolean sendEmail(String email, String otp) {
        if (email != null && otp != null) {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(email);
            message.setSubject("OTP for Email Verification");
            message.setText("Your OTP is: " + otp);

            emailConfig.mailSender().send(message);

            System.out.println("Email sent successfully: " + email + " " + otp);
            return true;
        }
        return false;
    }
}