package org.example.certificateExam1;

import com.beust.ah.A;

class A2 {
    public int i1 = 1;
    protected int i2 = 2;
}
public class Exam33 extends A2 {
    public void print() {
        A2 obj = new A2();
        System.out.println(obj.i1); //Line 8
        System.out.println(obj.i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }
    public static void main(String [] args) {
        new Exam33().print();
    }
}
