package com.bocek.api;

import java.util.Random;

public class RandomNumberGenerator implements MessageGenerator{
    @Override
    public int generate() {
        Random r=new Random();
        return  r.nextInt(10);

    }
}
