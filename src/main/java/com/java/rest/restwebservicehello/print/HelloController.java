package com.java.rest.restwebservicehello.print;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String test(){
        System.out.println("hello mama bhauni");
        return "hello mama";
    }

    @GetMapping("/alipikia")
    public String testmaikina(){
        System.out.println("hello alipikia maikina");
        return "hello maikina";
    }


}
