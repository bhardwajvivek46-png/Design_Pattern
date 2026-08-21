package com.solid_principals.InterfaceSegregation.lsp;

public class Upi implements Payment{
    @Override
    public void pay(Double amount) {
        System.out.println("UPI Payment Done");
    }
}
