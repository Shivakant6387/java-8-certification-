package org.example.certificateExam1.exam6;

public class Exam64 {
    public static void main(String[] args) {
        System.out.println(new RuntimeException()); //Line n1
        System.out.println(new RuntimeException("HELLO")); //Line n2
        System.out.println(new RuntimeException(new RuntimeException("HELLO"))); //Line n3
    }
}
