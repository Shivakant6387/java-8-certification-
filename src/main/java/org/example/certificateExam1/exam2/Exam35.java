package org.example.certificateExam1.exam2;
class Student {
    String name;
    int age;

    Student() {
        new Student("James", 25);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Exam35 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
