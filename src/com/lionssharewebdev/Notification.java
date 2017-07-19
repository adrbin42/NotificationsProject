package com.lionssharewebdev;

import java.time.LocalDateTime;

/**
 * Created by adrienne on 7/19/17.
 */

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();
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

    public void transport() throws NoTransportException {
        throw new NoTransportException();
    }
}
