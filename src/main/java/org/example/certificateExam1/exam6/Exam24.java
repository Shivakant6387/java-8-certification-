package org.example.certificateExam1.exam6;
class Message {
    String msg = "LET IT GO!";

    public void print() {
        System.out.println(msg);
    }
}
public class Exam24 {
    public static void change(Message m) { //Line n5
        m.msg = "NEVER LOOK BACK!"; //Line n6
    }

    public static void main(String[] args) {
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}
