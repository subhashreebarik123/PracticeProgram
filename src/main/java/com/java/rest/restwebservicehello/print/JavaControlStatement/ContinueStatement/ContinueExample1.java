package com.java.rest.restwebservicehello.print.JavaControlStatement.ContinueStatement;

public class ContinueExample1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
