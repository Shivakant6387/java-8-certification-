package org.example.certificateExam1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exam10 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));
    }
}
