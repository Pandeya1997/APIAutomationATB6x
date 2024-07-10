package com.thetestingacademy.misc.parrallel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainClass {
    @BeforeTest
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Before Test-method . thread id is :" + id + getClass().getSimpleName());
    }

    @Test
    public void testMethods1() {
        long id = Thread.currentThread().getId();
        System.out.println("Test-method One. thread id is :" + id + getClass().getSimpleName());
    }

    @Test
    public void testMethods2() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethods3() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethods4() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodsO5() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethods6() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id + getClass().getSimpleName());
    }

    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id + getClass().getSimpleName());

    }
}
