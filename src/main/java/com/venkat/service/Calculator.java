package com.venkat.service;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int division(int a, int b){
        if(b == 0){
            throw new RuntimeException("b should not be 0, provide value");
        }
        return a/b;
    }
}
