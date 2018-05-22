package com.example.codewars.kyu7;

import java.util.ArrayList;
import java.util.List;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] c = str.toCharArray();
        char[] b = new char[] {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < b.length; j++)
            if (c[i] == b[j]){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
