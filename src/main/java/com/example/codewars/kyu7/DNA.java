package com.example.codewars.kyu7;

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
}
