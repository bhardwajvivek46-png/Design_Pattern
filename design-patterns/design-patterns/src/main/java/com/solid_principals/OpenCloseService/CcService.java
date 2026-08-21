package com.solid_principals.OpenCloseService;

public class CcService implements PaymentService{

    @Override
    public void processPayment() {
        System.out.println("Credit Card payment");
    }
}
