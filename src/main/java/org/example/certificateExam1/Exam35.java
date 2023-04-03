package org.example.certificateExam1;

public class Exam35 {
    public static void main(String[] args) {
        String [] arr = {"I", "N", "S", "E", "R", "T"};
        for(/*INSERT*/int n=0;n<=arr.length;n++) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.print(arr[n]); //Line n1
        }
    }
}
