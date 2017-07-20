package com.lionssharewebdev;

import java.time.LocalDateTime;

/**
 * Created by adrienne on 7/19/17.
 */
public class TextNotification extends Notification{
    private String recipient;
    private String smsProvider;

    public TextNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smsProvider) {
        super(createdAt,subject,body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        this.showStatus();
        this.showSubjectTime();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    public void setSmsProvider(String smsProvider) {
        this.smsProvider = smsProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println("Text recipient: " + recipient);
        System.out.println("SMS Provider: " + smsProvider);
        System.out.println("Notification created at: " + getCreatedAt());
        System.out.println("Text Subject: " + getSubject());
        System.out.println("Text Body: " + getBody());
    }
}
