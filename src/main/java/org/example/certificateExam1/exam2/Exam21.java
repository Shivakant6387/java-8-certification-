package org.example.certificateExam1.exam2;

import java.time.Period;

public class Exam21 {
    public static void main(String [] args) {
        Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(period);
    }
}
