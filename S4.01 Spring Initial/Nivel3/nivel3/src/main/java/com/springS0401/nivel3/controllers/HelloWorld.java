package com.springS0401.nivel3.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String helloWorld() {
        return "HELLO WORLD.";
    }

    @RequestMapping("/nivel2")
    public String helloName(String name) {
        name= "Mauricio";
        return "Nivel 2: Hello " + name;
    }

}