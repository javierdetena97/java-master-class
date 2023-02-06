package com.amigoscode.gettingstarted;

public class Exercise5 {
    public static void main(String[] args) {
        /*
            Write a program that compares two String contents.
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
        */
        String name = "Javier";
        String surname = "de Tena";
        boolean areEqual = name.equals(surname);
        System.out.println(areEqual);
    }
}
