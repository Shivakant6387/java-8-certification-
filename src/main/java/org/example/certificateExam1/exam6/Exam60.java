package org.example.certificateExam1.exam6;

public class Exam60 {
    public static void main(String[] args) {
        outer: for(int i = 0; i < 3; System.out.print(i)) {
            i++;
            inner: for(int j = 0; j < 3; System.out.print(j)) {
                if(i > ++j) {
                    break outer;
                }
            }
        }
    }
}
