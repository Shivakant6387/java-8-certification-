package org.example.certificateExam1.exam2;
class Student2{
    String name;
    int age;

    Student2() {
        new Student("James", 25);
    }

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Exam35 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        System.out.println(s.name + ":" + s.age);
    }
}
