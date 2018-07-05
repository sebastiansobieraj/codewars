package com.example.codewars.kyu6;

public class Codility {
    public int solution(String S) {
        int numberOfOne = 0;
        String a = "RL";
        String b = "RRLL";
        String c = "LR";
        String d = "LLRR";

        for (int i =0; i < S.length(); i++){
            if (S.substring(0, i).contains(a)|| S.substring(0, i).contains(b)
                    || S.substring(0, i).contains(c) || S.substring(0, i).contains(d)) {
                numberOfOne++;
            }
        }
        System.out.println(numberOfOne);
        return numberOfOne;
    }
}
