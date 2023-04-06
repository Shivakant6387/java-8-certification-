package org.example.certificateExam1.exam6;
interface Flyable {
    static int horizontalDegree() { //Line n1
        return 20;
    }

    default void fly() {
        System.out.println("Flying at " + horizontalDegree() + " degrees."); //Line n2
    }

    void land();
}
public class Exam7 implements Flyable {
    public void land() {
        System.out.println("Landing at " + -Flyable.horizontalDegree() + " degrees."); //Line n3
    }

    public static void main(String[] args) {
        new Exam7().fly();
        new Exam7().land();
    }
}
