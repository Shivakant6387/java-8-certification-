package org.example.certificateExam1.exam6;
interface Document {
    default String getType() {
        return "TEXT";
    }
}

interface WordDocument extends Document {
    String getType();
}

//class Word implements WordDocument {}

public class Exam9 {
    public static void main(String[] args) {
       // Document doc = new Word(); //Line n1
       // System.out.println(doc.getType()); //Line n2
    }
}
