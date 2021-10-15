package com.bocek.api;

import java.beans.JavaBean;


public class PrintA implements IPrintA {
    private final MessageGenerator messageGenerator;

    public PrintA(MessageGenerator generator) {
        this.messageGenerator = generator;
    }

    @Override
    public String print() {
        return   "printA - " + this.messageGenerator.generate();
    }
}
