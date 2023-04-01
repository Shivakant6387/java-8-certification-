package org.example.certificateExam1;

import java.util.ArrayList;
import java.util.List;

public class Exam6 {
    public static void main(String[] args) {
        String []names={"Smith","Brown","Thomas","Taylor","Jones"};
        List<String>list=new ArrayList<>();
        for (int i=0;i<names.length;i++){
            list.add(names[i]);
            switch (i){
                case 2:
                    continue;
            }
            break;
        }
        System.out.println(list.size());
    }
}
