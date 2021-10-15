package com.bocek.api;

public class PrintB implements Print {

    private final MessageGenerator messageGenerator;

    public PrintB(MessageGenerator generator) {
        this.messageGenerator = generator;
    }

    @Override
    public String print() {
        return "printB - " + this.messageGenerator.generate();
    }
}
