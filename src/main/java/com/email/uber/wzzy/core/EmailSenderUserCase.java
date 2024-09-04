package com.email.uber.wzzy.core;

public interface EmailSenderUserCase {

    void sendEmail(String to, String subject, String body);
}