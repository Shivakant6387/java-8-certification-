package org.example.certificateExam1;
class Students {
    String name;
    int marks;

    Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class Exam41 {
    public static void main(String[] args) {
        Students students = new Students("James", 25);
        int marks = 25;
        review(students, marks);
        System.out.println(marks + "-" + students.marks);
    }

    private static void review(Students stud, int marks) {
        marks = marks + 10;
        stud.marks+=marks;
    }
}
