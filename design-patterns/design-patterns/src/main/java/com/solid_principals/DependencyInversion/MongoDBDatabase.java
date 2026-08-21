package com.solid_principals.DependencyInversion;

public class MongoDBDatabase implements Database{

    @Override
    public void save(String data) {
        System.out.println("Storing document in MongoDB: "+data);
    }
}
