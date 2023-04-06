package org.example.certificateExam1.exam6;
class Super {
    Super() {
        System.out.print("Reach");
    }
}

class Sub extends Super {
    Sub() {
        //Super();
        System.out.print("Out");
    }
}
public class Exam33 {
    public static void main(String[] args) {
        new Sub();
    }
}
