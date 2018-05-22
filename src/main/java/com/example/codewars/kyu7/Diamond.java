package com.example.codewars.kyu7;

public class Diamond {
    public static String print(int n) {
        if (n % 2 == 0) {
            return null;
        }
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < n - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }

        for (int i = n; i > 0; i -= 2) {
            for (int j = 0; j < n - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }
        return null;
    }
}
