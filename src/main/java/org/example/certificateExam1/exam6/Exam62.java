package org.example.certificateExam1.exam6;

import java.io.IOException;

class Super3 {
    Super3() throws RuntimeException {
        System.out.print("CARPE ");
    }
}

class Sub3 extends Super3{
    Sub3() throws IOException {
        System.out.print("DIEM ");
    }
}

public class Exam62 {
    public static void main(String[] args) throws Exception {
        new Sub3();
    }
}