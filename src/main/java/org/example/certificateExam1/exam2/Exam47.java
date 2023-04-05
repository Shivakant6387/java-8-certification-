package org.example.certificateExam1.exam2;

import java.util.function.Predicate;

public class Exam47 {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****"};
      //  Predicate pr1 = s -> s.length() < 4;
       // print(arr, pr1);
    }

    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
