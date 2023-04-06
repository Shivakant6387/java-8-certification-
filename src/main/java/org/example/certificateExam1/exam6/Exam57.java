package org.example.certificateExam1.exam6;

public class Exam57 {
    public static void main(String[] args) {
        try { //outer
            try { //inner
                System.out.println(1/0);
            } catch(ArithmeticException e) {
                System.out.println("INNER");
            } finally {
                System.out.println("FINALLY 1");
            }
        } catch(ArithmeticException e) {
            System.out.println("OUTER");
        } finally {
            System.out.println("FINALLY 2");
        }
    }
}
