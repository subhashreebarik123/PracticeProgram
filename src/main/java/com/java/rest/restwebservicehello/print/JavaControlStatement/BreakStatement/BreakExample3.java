package com.java.rest.restwebservicehello.print.JavaControlStatement.BreakStatement;

public class BreakExample3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}