package com.email.uber.wzzy.controller;

import com.email.uber.wzzy.core.EmailRequest;
import com.email.uber.wzzy.core.exception.EmailServiceException;
import com.email.uber.wzzy.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailService) {
        this.emailSenderService = emailService;
    }

    @PostMapping()
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {

        try {
            this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
            return ResponseEntity.ok("email sent sucessfully");
        } catch (EmailServiceException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while sending email");
        }
    }
}
