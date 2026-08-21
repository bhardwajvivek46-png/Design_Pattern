package com.solid_principals.DependencyInversion;

public class MySQLDatabase implements Database{

    @Override
    public void save(String data) {
        System.out.println("Saving data in MySQL : "+data);
    }
}
