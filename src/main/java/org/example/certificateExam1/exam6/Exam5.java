package org.example.certificateExam1.exam6;

public class Exam5 {
    public static void main(String[] args) {
        int num = 10;
        if(num++ == num++) {
            System.out.println("EQUAL " + num);
        } else {
            System.out.println("NOT EQUAL " + num);
        }
    }
}
