package org.example.certificateExam1.exam2;

import java.time.LocalDate;

public class Exam3 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.parse("1980-03-16");
        System.out.println(date.minusYears(-5));
    }
}
