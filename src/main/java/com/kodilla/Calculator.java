package com.kodilla;

public class Calculator {

    public void addition(int a, int b) {
        int subtractionAB = a+b;
        System.out.println(subtractionAB);
    }

    public void subtraction (int c, int d) {
        int subtractionCD = c-d;
        System.out.println(subtractionCD + "ok");
    }
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(5,6);
        calculator.subtraction(5,6);
    }

}
