package com.example.codewars.kyu7;

public class CamelCasse {
    static String toCamelCase(String s){
        String upper_case_line = "";
        upper_case_line += Character.toUpperCase(s.charAt(0)) + s.substring(1);
        return upper_case_line.replaceAll("[-_]", "".toUpperCase());
    }
}
