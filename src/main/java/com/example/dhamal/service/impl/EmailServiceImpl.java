package com.example.dhamal.service.impl;

import com.example.dhamal.service.EmailService;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

/**
 * @Author: Santosh Paudel
 */

@Service
public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmailToUser() throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("rockbrett03@gmail.com", "vcftyqtxevktexux"));
        email.setSSLOnConnect(true);
        email.setFrom("no-reply@gmail.com");
        email.setSubject("This mail is for testing");
        email.setMsg("Hello dude, if you get this email, we have successfully cooed email sent feature in java");
        email.addTo("prabininwork@gmail.com");
        email.send();
    }
}
