package com.solid_principals.InterfaceSegregation.lsp;

public class CreditCard implements Payment{
    @Override
    public void pay(Double amount) {
        if(amount>100000){
            throw new UnsupportedOperationException("Amount limit exceeded");
        }
        System.out.println("Credit Card Payment Done");
    }
}
