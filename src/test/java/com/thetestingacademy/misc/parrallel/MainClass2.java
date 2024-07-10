package com.thetestingacademy.misc.parrallel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainClass2 {
    @BeforeTest
    public void beforeMethodMC() {
        long id = Thread.currentThread().getId();
        System.out.println("Before Test-method . thread id is :" + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodMC1() {
        long id = Thread.currentThread().getId();
        System.out.println("Test-method One. thread id is :" + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodMC2() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodMC3() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodMC4() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodMC5() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodMC6() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id + getClass().getSimpleName());
    }

    @AfterMethod
    public void afterMethodMC7() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id + getClass().getSimpleName());

    }
}
