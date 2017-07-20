package com.lionssharewebdev;

import java.time.LocalDateTime;

/**
 * Created by adrienne on 7/19/17.
 */
public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smtpProvider) {
        super(createdAt, subject, body);
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

    @Override
    public void showSubjectTime() {
        System.out.println("Everything is ok with this notification.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (getRecipient() != null ? !getRecipient().equals(that.getRecipient()) : that.getRecipient() != null)
            return false;
        return getSmtpProvider() != null ? getSmtpProvider().equals(that.getSmtpProvider()) : that.getSmtpProvider() == null;
    }

    @Override
    public int hashCode() {
        int result = getRecipient() != null ? getRecipient().hashCode() : 0;
        result = 31 * result + (getSmtpProvider() != null ? getSmtpProvider().hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new EmailNotification(LocalDateTime.now(), "Meet up later", "Meet me at 3pm", "Alexis Bing"," AT&T" );
    }
}
