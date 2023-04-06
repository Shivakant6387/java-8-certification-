package org.example.certificateExam1.exam6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exam54 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("an");
        words.add("the");
        words.add("when");
        words.add("what");
        words.add("Where");
        words.add("whether");

        processStringArray(words,   p->true/*INSERT*/);
    }

    private static void processStringArray(List<String> list, Predicate<String> predicate) {
        for(String str : list) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
