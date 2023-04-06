package org.example.certificateExam1.exam6;

public class Exam67 {
    private static void test() throws Exception {
        throw new Exception();
    }

    public static void main(String [] args) {
        try {
           // test();
        } finally {
            System.out.println("GAME ON");
        }
    }
}
