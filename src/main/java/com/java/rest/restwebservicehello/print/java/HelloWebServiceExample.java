package com.java.rest.restwebservicehello.print.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWebServiceExample {
    @RequestMapping("/hello mama")
    public String print(){
        System.out.println("Hello world");
        return "World";
    }
    @GetMapping("/Hello java")
    public String test() {
        System.out.println(" Hello Core Java");
        return "javatpoint";
    }
    @RequestMapping("/Hello Jayanti")
    public String fun1(){
        System.out.println("Hello Jayanti Barik");
        return "jayanti";
    }
    @GetMapping("/Hello subha")
    public String fun(){
        System.out.println("Hello subhashree");
        return "subhashree";
    }
}
