package org.example.certificateExam1.exam6;
class X {
    void A() {
        System.out.print("A");
    }
}

class Y extends X {
    void A() {
        System.out.print("A-");
    }

    void B() {
        System.out.print("B-");
    }

    void C() {
        System.out.print("C-");
    }
}
public class Exam47 {
    public static void main(String[] args) {
        X obj = new Y(); //Line n1
        obj.A(); //Line n2
//        obj.B(); //Line n3
//        obj.C(); //Line n4
    }
}
