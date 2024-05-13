package com.java.rest.restwebservicehello.print.JavaControlStatement.IfElseStatement;

public class NestedExample1 {
    public static void main(String[] args) {
        int age = 30;
        int weight = 40;
        if(age<=32){
            if(weight>50){
                System.out.println("You are eligible for blood donate");
            } else {
                System.out.println("You are not eligible for blood donate");
            }
        }

    }
}
