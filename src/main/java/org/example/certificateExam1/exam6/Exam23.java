package org.example.certificateExam1.exam6;

import java.time.LocalDate;

public class Exam23 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2020-08-31");
        System.out.println(date.plusMonths(-6));
    }
}
