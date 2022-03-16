package com.calculator;

import java.util.Random;

public class Calculator implements calculator.Calculator {
    @Override
    public int sum(int i, int i1) {
        System.out.println("Fake Calculator");
        return new Random().nextInt(1000);
    }
}
