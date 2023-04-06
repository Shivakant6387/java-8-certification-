package org.example.certificateExam1.exam6;
class Base5 {
    String msg = "INHALE"; //Line n1
}

class Derived5 extends Base5 {
    Object msg = "EXHALE"; //Line n2
}
public class Exam68 {
    public static void main(String[] args) {
        Base5 obj1 = new Base5(); //Line n3
        Base5 obj2 = new Derived5(); //Line n4
        Derived5 obj3 = (Derived5) obj2; //Line n5
        String text = obj1.msg + "-" + obj2.msg + "-" + obj3.msg; //Line n6
        System.out.println(text); //Line n7
    }
}
