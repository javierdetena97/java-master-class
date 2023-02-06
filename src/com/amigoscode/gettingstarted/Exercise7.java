package com.amigoscode.gettingstarted;

public class Exercise7 {
    public static void main(String[] args) {
        // Write a program that transform "amigoscode" to "Amigoscode"
        String amigoscode = "amigoscode";
        String a = amigoscode.substring(0, 1).toUpperCase();
        String migoscode = amigoscode.substring(1);
        System.out.println(a + migoscode);
    }
}
