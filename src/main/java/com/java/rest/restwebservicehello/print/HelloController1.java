package com.java.rest.restwebservicehello.print;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController1 {
    @GetMapping ("/mama")
    public  String print (){
        System.out.println("Sprint Boot");
        return "Hello World";

    }
}
