package org.example.certificateExam1.exam6;
interface Blogger {
    default void blog() throws Exception {
        System.out.println("GENERIC");
    }
}

class TravelBlogger implements Blogger {
    public void blog() {
        System.out.println("TRAVEL");
    }
}
public class Exam17 {
    public static void main(String[] args) {
        Blogger blogger = new TravelBlogger(); //Line n1
        ((TravelBlogger)blogger).blog(); //Line n2
    }
}
