package org.example.certificateExam1.exam2;

import java.time.LocalDate;

public class Exam20 {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate eventDate = LocalDate.of(2018, 1, 1);
        boolean flag1 = newYear.isAfter(eventDate);
        boolean flag2 = newYear.isBefore(eventDate);
        System.out.println(flag1 + ":" + flag2);

    }
}
