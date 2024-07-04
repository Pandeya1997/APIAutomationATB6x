package com.thetestingacademy.utils;

import com.github.javafaker.Faker;

public class fakerutil {
    Faker faker;

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }
}
