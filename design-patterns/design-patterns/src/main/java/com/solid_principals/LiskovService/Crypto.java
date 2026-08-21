package com.solid_principals.LiskovService;

public class Crypto implements NonRefundablePayments{
    @Override
    public void pay() {
        System.out.println("Crypto payment done");
    }

}
