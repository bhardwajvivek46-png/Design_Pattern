package com.solid_principals.OpenCloseService;

public class NetBankingService implements PaymentService{

    @Override
    public void processPayment() {
        System.out.println("Net Banking payment");
    }
}
