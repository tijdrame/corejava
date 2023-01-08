package com.emard.java9.privatemethods;

public class SendNotificationImpl implements SendNotification {
    public static void main(String[] args) {
        SendNotification send = new SendNotificationImpl();
        send.sendNotification();
        send.sendNotifications();

    }
}
