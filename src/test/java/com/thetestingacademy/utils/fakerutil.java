package com.thetestingacademy.utils;

public class fakerutil {
    Faker faker = new Faker();
    public String getFirstName(){
        return faker.name().firstName();
    }
    public String getLastName(){
        return faker.name().lastName();
    }
}
