package com.example.codewars.kyu7;

public class Factorial {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = 1;
        if (n > 0 && n < 13) {
            for (int i = 1; i < n + 1; i++) {
                factorial *= i;
            }
        } else {
            throw new IllegalArgumentException();
        }
        return factorial;
    }
}
