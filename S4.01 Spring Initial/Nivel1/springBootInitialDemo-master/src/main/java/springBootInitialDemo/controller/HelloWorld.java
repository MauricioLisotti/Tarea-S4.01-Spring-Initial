package springBootInitialDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String helloWorld() {
        return "HELLO WORLD.";
    }

    @RequestMapping("/fase2")
    public String helloName(String name) {
        name= "Mauricio";
        return "Fase 2 ejercicio Gradle. Hello " + name;
    }

}
