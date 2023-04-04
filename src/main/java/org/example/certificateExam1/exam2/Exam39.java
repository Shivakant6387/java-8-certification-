package org.example.certificateExam1.exam2;
class Parent {
    public String toString() {
        return "Inner ";
    }
}

class Child extends Parent {
    public String toString() {
        return super.toString().concat("Peace!");
    }
}

public class Exam39 {
    public static void main(String[] args) {
        System.out.println(new Child());

    }
}
