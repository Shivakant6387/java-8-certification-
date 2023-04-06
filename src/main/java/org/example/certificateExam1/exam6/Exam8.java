package org.example.certificateExam1.exam6;
interface Rideable {
    void ride(String name);
}

class Animal {}

class Horse extends Animal implements Rideable {
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
}
public class Exam8 {
    public static void main(String[] args) {
        Animal horse = new Horse();

    }
}
