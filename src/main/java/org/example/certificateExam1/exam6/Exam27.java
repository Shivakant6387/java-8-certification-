package org.example.certificateExam1.exam6;

import java.util.ArrayList;
import java.util.List;

public class Exam27 {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>(); //Line n1
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        list.addAll(list.subList(0, 4)); //Line n2
        System.out.println(list);
    }
}
