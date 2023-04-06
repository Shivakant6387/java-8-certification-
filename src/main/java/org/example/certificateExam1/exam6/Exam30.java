package org.example.certificateExam1.exam6;
interface I1 {
    public static void print(String str) {
        System.out.println("I1:" + str.toUpperCase());
    }
}

class C1 implements I1 {
    void print(String str) {
        System.out.println("C1:" + str.toLowerCase());
    }
}
public class Exam30 {
    public static void main(String[] args) {
        I1 obj = new C1();
       // obj.print("Java");
    }
}
