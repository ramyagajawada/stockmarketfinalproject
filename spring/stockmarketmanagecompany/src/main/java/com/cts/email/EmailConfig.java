package com.cts.email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
 
@Configuration
public class EmailConfig 
{
    @Bean
    public SimpleMailMessage emailTemplate()
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("yerasisahithireddy026@gmail.com");
        message.setFrom("ramyagajawada50@gmail.com");
        message.setSubject("Important email");
        message.setText("FATAL - Application crash. Save your job !!");
        return message;
    }
}