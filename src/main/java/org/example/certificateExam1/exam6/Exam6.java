package org.example.certificateExam1.exam6;
class Paper {
    static String getType() { //Line n1
        return "GENERIC";
    }
}

class RuledPaper extends Paper {
    static String getType() { //Line n2
        return "RULED";
    }
}
public class Exam6 {
    public static void main(String[] args) {
        Paper paper = new RuledPaper(); //Line n3
        System.out.println(paper.getType()); //Line n4
    }
}
