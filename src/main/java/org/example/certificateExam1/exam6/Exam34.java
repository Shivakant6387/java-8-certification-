package org.example.certificateExam1.exam6;

public class Exam34 {
    public static void main(String[] args) {
        String arr1 [], arr2, arr3 = null; //Line n1
        arr1 = new String[2];
        arr1[0] = "A";
        arr1[1] = "B";
       // arr2 = arr3 = arr1; //Line n2
        //log(arr2); //Line n3
    }

    private static void log(String... vals) {
        for(String s : vals)
            System.out.print(s);
    }

}
