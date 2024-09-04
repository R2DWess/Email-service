package com.email.uber.wzzy.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String  body);
}
