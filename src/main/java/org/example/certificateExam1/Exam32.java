package org.example.certificateExam1;
 class A1 {
    public void print() {
        System.out.println("A");
    }
}
class B2 extends A1 {
    public void print() {
        System.out.println("B");
    }
}
public class Exam32 {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        B2 obj2 = (B2)obj1;
        obj2.print();
    }
}
