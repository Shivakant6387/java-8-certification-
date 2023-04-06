package org.example.certificateExam1.exam6;

public class Exam20 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30}; //Line n1
        int i = 0;
        arr[i++] = arr[++i] = 40; //Line n2
        for(int x : arr)
            System.out.println(x);
    }
}
