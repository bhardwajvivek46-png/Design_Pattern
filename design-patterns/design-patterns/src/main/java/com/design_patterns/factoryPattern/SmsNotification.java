package com.design_patterns.factoryPattern;

public class SmsNotification implements Notification{

    public void send(){
        System.out.println("Sending SMS");
    }
}
