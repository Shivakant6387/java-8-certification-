package org.example.certificateExam1.exam6;

class MyClass1{
    MyClass1() {
        System.out.println(101);
    }
}

class MySubClass extends MyClass {
    //final
    MySubClass() {
        System.out.println(202);
    }
}
public class Exam36 {
    public static void main(String[] args) {
        System.out.println(new MySubClass());
    }
}
