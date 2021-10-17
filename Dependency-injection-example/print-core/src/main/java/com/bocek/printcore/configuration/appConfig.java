package com.bocek.printcore.configuration;

import com.bocek.api.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class appConfig {

    @Bean()
    public IPrintA getPrintA() {
        return new PrintA(new RandomNumberGenerator());
    }

    @Bean()
    public IPrintB getPrintB() {
        return new PrintB(new RandomNumberGenerator());
    }


}
