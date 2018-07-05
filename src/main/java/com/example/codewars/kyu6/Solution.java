package com.example.codewars.kyu6;

public class Solution {
    public int solution(String S) {
        int n = 0;
        String word = "";
        String word2 = "";

        for (int t = 1; t < S.length(); t++) {
            word = S.substring(0, t);
            word2 = S.substring(S.length() - t, S.length());
            if (word.equals(word2)){
                n = word.length();
            }
        }
        return n;
    }
}
