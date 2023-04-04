package org.example.certificateExam1.exam2;

import java.util.ArrayList;
import java.util.List;

public class Exam5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
    }
}
