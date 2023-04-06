package org.example.certificateExam1.exam6;

class Base2 {
    int id = 1000; //Line n1

    Base2() {
        Base(); //Line n2
    }

    void Base() { //Line n3
        System.out.println(++id); //Line n4
    }
}

class Derived2 extends Base2 {
    int id = 2000; //Line n5

    Derived2() {} //Line n6

    void Base() { //Line n7
        System.out.println(--id); //Line n8
    }
}
public class Exam52 {
    public static void main(String[] args) {
        Base base = new Derived(); //Line n9
    }
}
