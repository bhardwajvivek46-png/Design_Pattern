package com.design_patterns.factoryPattern;

public class EmailNotification implements Notification{

    public void send(){
        System.out.println("Sending Email");
    }
}
