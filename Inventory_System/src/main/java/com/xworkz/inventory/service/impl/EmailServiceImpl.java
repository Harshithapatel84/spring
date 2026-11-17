package com.xworkz.inventory.service.impl;

import com.xworkz.inventory.service.EmailService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine; // Use spring6 if on Spring 6

import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;
    private final SpringTemplateEngine templateEngine;

    public EmailServiceImpl(JavaMailSender mailSender, SpringTemplateEngine templateEngine) {
        this.mailSender = mailSender;
        this.templateEngine = templateEngine;
    }

    @Override
    public Boolean sendEmail(String email, String otp) {
        if (email == null || otp == null) {
            return false;
        }

        String name = "harshitha";
        try {
            String displayName = (name != null && !name.trim().isEmpty()) ? name.trim() : email.split("@")[0];
            System.out.println("Sending OTP email -> email=[" + email + "], name=[" + displayName + "], otp=[" + otp + "]");

            Context context = new Context();
            context.setVariable("name", displayName);
            context.setVariable("otp", otp);

            String htmlBody = templateEngine.process("otpemail", context);

            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");


            helper.setTo(email);
            helper.setSubject("OTP for Email Verification");
            helper.setText(htmlBody, true);

            mailSender.send(message);
            System.out.println("Template email sent successfully to " + email);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

//{
//            SimpleMailMessage message = new SimpleMailMessage();
//
//            message.setTo(email);
//            message.setSubject("OTP for Email Verification");
//            message.setText("Your OTP is: " + otp);
//
//            emailConfig.mailSender().send(message);
//
//            System.out.println("Email sent successfully: " + email + " " + otp);
//            return true;
//        }
//        return false;
