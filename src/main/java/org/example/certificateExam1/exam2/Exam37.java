package org.example.certificateExam1.exam2;

import java.util.ArrayList;
import java.util.List;

public class Exam37 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");

        if(list.remove("THREE")) {
            list.remove("THREE");
        }

        System.out.println(list);
    }
}
