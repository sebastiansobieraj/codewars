package com.example.codewars.kyu7;

public class Middle {
    public static String getMiddle(String word) {
        String s = "";
        int length = word.length();
        int half = length / 2;
        if (length % 2 == 0) {
            s = word.substring(half - 1, half + 1);
        } else {
            s = word.substring(half, half + 1);
        }
        System.out.println(s);
        return s;
    }
}
