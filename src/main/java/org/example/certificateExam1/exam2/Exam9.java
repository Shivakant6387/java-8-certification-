package org.example.certificateExam1.exam2;

import java.util.function.Predicate;

public class Exam9 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        processStringArray(arr,p->!false /*INSERT*/);
    }

    private static void processStringArray(String [] arr,
                                           Predicate<String> predicate) {
        for(String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
