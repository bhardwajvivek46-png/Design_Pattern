package com.solid_principals.InterfaceSegregation.lsp;

public class PaymentClient {

    public void processTransaction(Payment payment){
        payment.pay(100.0);
    }
}
