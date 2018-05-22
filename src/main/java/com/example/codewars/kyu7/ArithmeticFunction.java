package com.example.codewars.kyu7;

public class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        int result;
        switch (operator) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Invalid argument: " + operator);
        }
        return result;
    }
}

