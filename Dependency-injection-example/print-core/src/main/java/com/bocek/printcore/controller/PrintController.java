package com.bocek.printcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.bocek.api.*;

@RestController
public class PrintController {

    private final IPrintA print;

    public PrintController(IPrintA print) {
        this.print = print;
    }

    @GetMapping("/print")
    public String print() {

        return print.print();
    }
}
