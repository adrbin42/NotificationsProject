package com.lionssharewebdev;

/**
 * Created by adrienne on 7/19/17.
 */
public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    public void setSmtpProvider(String smtpProvider) {
        this.smtpProvider = smtpProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println("Email recipient: " + recipient);
        System.out.println("SMTP Provider: " + smtpProvider);
        System.out.println("Email Subject: " + getSubject());
        System.out.println("Email Body: " + getBody());
    }
}
