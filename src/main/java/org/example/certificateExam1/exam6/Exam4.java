package org.example.certificateExam1.exam6;

import java.io.FileNotFoundException;

public class Exam4 {
    public static void main(String[] args) {
        try {
            System.out.println(args[1].length());
        } catch (RuntimeException ex) {
            System.out.println("ONE");
//        } catch (FileNotFoundException ex) {
//            System.out.println("TWO");
        }
        System.out.println("THREE");
    }
}
