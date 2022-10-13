package com.example.dhamal.service;

import org.apache.commons.mail.EmailException;

public interface EmailService {
    void sendEmailToUser() throws EmailException;
}
