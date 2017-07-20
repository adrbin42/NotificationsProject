package com.lionssharewebdev;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("Email Notification");
        EmailNotification emailnotification = new EmailNotification(LocalDateTime.now(),"Project Status","Project is on track.","Alexis Bing","AT&T");
        emailnotification.transport();
        emailnotification.showStatus();
        emailnotification.showSubjectTime();
        try{
            Object emailNotificationClone = emailnotification.clone();
            final boolean isCloned = emailNotificationClone.equals(emailnotification);
            if(isCloned){
                System.out.println("Successful cloning");
            }
            else{
                System.out.println("Cloning failed");
            }
        }catch(CloneNotSupportedException ex){
            System.out.println("Clone Not Supported Exception");
        }
        System.out.println("-------------------------------------------");
        System.out.println("Text Notification");
        TextNotification textnotification = new TextNotification(LocalDateTime.now(),"Dinner","Meet me at 8pm for dinner.","Alexis","AT&T");
        textnotification.transport();
        textnotification.showStatus();
    }
}
