package com.kodilla;

public class Calculator {

    public int addition(int a, int b) {
        int subtractionAB = a+b;
        System.out.println(subtractionAB);
        return subtractionAB;
    }

    public int subtraction (int c, int d) {
        int subtractionCD = c-d;
        System.out.println(subtractionCD + "ok!");
        return subtractionCD;
    }
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(5,6);
        calculator.subtraction(5,6);
    };

}
