package com.calculator;

public class Calculator implements calculator.Calculator {
    @Override
    public int sum(int i, int i1) {
        System.out.println("Real Calculator");
        return i + i1;
    }
}
