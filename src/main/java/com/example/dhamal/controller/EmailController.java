package com.example.dhamal.controller;

import com.example.dhamal.pojo.ApiResponse;
import com.example.dhamal.service.EmailService;
import org.apache.commons.mail.EmailException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Santosh Paudel
 */

@RestController
@RequestMapping("/email/")
public class EmailController extends ApiResponse {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("send/")
    public ApiResponse sendEmailToUSer() throws EmailException {
        emailService.sendEmailToUser();
        return success("Email sent successfully", null);
    }
}
