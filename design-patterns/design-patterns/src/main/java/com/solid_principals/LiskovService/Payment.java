package com.solid_principals.LiskovService;

public interface Payment extends NonRefundablePayments {

    void refund();
}
