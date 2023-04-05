package org.example.certificateExam1.exam2;

public class Exam50 {
    private static void m1() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("A");
        }
    }
}
