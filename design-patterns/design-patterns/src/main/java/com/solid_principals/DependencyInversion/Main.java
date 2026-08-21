package com.solid_principals.DependencyInversion;

public class Main {

    public static void main(String[] args) {
        UserService u1 = new UserService(new MongoDBDatabase());
        u1.saveUser("Vivek");

        UserService u2 = new UserService(new MySQLDatabase());
        u1.saveUser("Vivek");
    }
}
