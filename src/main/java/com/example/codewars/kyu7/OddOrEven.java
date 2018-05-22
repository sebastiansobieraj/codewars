package com.example.codewars.kyu7;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        String answer = "";
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        if(sum%2 == 0) {
            answer = "even";
        } else {
            answer = "odd";
        }
        return answer;
    }
}
