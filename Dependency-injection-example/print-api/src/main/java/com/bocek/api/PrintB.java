package com.bocek.api;

public class PrintB implements IPrintB {

    private final MessageGenerator messageGenerator;

    public PrintB(MessageGenerator generator) {
        this.messageGenerator = generator;
    }

    @Override
    public String print() {
        return "printB - " + this.messageGenerator.generate();
    }
}
