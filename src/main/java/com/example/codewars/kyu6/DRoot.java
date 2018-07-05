package com.example.codewars.kyu6;

public class DRoot {
    public static int digital_root(int n) {
        while(n > 9){
            n = n/10 + n % 10;
        }
        System.out.println(n);
        return(n);
    }
}