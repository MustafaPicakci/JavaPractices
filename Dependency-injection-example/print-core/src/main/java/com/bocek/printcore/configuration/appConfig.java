package com.bocek.printcore.configuration;

import com.bocek.api.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class appConfig {

    @Bean()
    public Print getPrintA() {
        return new PrintA(new RandomNumberGenerator());
    }

    @Bean()
    public Print getPrintB() {
        return new PrintB(new RandomNumberGenerator());
    }


}
