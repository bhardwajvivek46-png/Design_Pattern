package com.solid_principals.InterfaceSegregation.isp;

public class BackendDeveloper implements Coder, Tester {
    @Override
    public void writeCode() {
        System.out.println("Writing backend code");
    }

    @Override
    public void testCode() {
        System.out.println("Dev Testing");
    }

}
