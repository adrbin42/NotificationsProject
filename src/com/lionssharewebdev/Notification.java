package com.lionssharewebdev;

import java.time.LocalDateTime;

/**
 * Created by adrienne on 7/19/17.
 */

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "OK";

    public Notification(LocalDateTime createdAt, String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void showStatus(){
        System.out.println("Current status: "+ status);
    }

    protected void showSubjectTime(){
        System.out.println("Your notification was created at : " + createdAt + "and the subject was " + subject + ".");
    };

    public void transport() throws NoTransportException {
        throw new NoTransportException();
    }
}
