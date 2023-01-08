package com.emard.java9.privatemethods;

public interface SendNotification {
    default void sendNotifications(){
        establishConnection();
        System.out.println("Sending multiple Notifications");
    }
    default void sendNotification(){
        establishConnection();
        System.out.println("Sending multiple Notifications");
    }


    private void establishConnection(){
        System.out.println("Establisihing a connection");
    }
}
