package org.example.certificateExam1.exam6;
interface GetSetGo {
    int count = 1; //Line n1
}
public class Exam56 {
    public static void main(String[] args) {
        GetSetGo [] arr = new GetSetGo[5]; //Line n2
        for(GetSetGo obj : arr) {
          //  obj.count++; //Line n3
        }
        System.out.println(GetSetGo.count); //Line n4
    }
}
