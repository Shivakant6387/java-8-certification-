package org.example.certificateExam1.exam2;
class Parent1 {
    int i = 10;
    Parent1(int i) {
        super();
        this.i = i;
    }
}

class Child1 extends Parent1 {
    int j = 20;

    Child1(int j) {
        super(0);
        this.j = j;
    }

    Child1(int i, int j) {
        super(i);
       // this(j);
    }

}
public class Exam64 {
    public static void main(String[] args) {
        Child1 child = new Child1(1000, 2000);
        System.out.println(child.i + ":" + child.j);
    }
}
