package com.solid_principals.SingleResponsibilityServices;

public class BillingService {

    public void generateInvoice(){
        System.out.println("Invoice generated");
    }

    public void downloadInvoicePdf(){
        System.out.println("Invoice downloaded");
    }
}
