package org.example.certificateExam1;
class Messages {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}
public class Exam45 {
    public static void change(Messages m) { //Line n5
        m = new Messages(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }

    public static void main(String[] args) {
        Messages obj = new Messages(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}
