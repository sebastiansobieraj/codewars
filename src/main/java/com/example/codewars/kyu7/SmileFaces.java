package com.example.codewars.kyu7;

import java.util.ArrayList;
import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        String [] a = {":)",";)",":-)",";-)",";~)",":~)",":D",";D",":-D",":~D",";-D",";~D"};
        int count = 0;
        if (arr.isEmpty()) {
            count = 0;
        } else {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < a.length; j++) {
                    if (arr.get(i)==a[j]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
