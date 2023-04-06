package org.example.certificateExam1.exam6;
class Calculator {
    int calculate(int i1, int i2) {
        return i1 + i2;
    }

    double calculate(byte b1, byte b2) {
        return b1 % b2;
    }
}
public class Exam3 {
    public static void main(String[] args) {
        byte b = 100;
        int i = 20;
        System.out.println(new Calculator().calculate(b, i));
    }
}
