package com.example.codewars.kyu7;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int sum = 0;
        if(walk.length == 10) {
            for (int i = 0; i < walk.length; i++) {
                if (walk[i] == 'n') {
                    sum++;
                } else if (walk[i] == 's') {
                    sum--;
                } else if (walk[i] == 'w') {
                    sum += 2;
                } else if (walk[i] == 'e') {
                    sum -= 2;
                }
            }
            return (sum == 0);
        } else return false;
    }
}

