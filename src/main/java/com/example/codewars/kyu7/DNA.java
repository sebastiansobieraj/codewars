package com.example.codewars.kyu7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DNA {
    public static String makeComplement(String dna) {
        dna = dna.replace('A','Z');
        dna = dna.replace('T','A');
        dna = dna.replace('Z','T');
        dna = dna.replace('C','Z');
        dna = dna.replace('G','C');
        dna = dna.replace('Z','G');
        System.out.println(dna);
        return dna;
    }

    public static class MinMax {
        public static int[] minMax(int[] arr) {
            List<Integer> arr2 = new ArrayList();
            int min = 0;
            int max = 0;
            for (int i = 0; i < arr.length; i++){
                arr2.add(arr[i]);
            }
            min = Collections.min(arr2);
            max = Collections.max(arr2);
            int [] arr3 = new int[] {min, max};
            return arr3;
        }
    }
}
