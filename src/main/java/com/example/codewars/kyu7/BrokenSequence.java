package com.example.codewars.kyu7;

import java.util.ArrayList;
import java.util.List;

public class BrokenSequence {
    public int findMissingNumber(String sequence) {
        if(sequence.isEmpty())
            return 0;

        for(int i = 1; i < sequence.split(" ").length + 1; i++){
            String s = i + "";
            if(sequence.indexOf(s) == -1){
                return i;
            }
        }
        return 0;
    }
}