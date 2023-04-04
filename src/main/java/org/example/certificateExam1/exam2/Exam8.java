package org.example.certificateExam1.exam2;
class Message{
    String msg="Happy New Year!";
    public void print(){
        System.out.println(msg);
    }
}
public class Exam8 {
    public static void change(Message message){
        message.msg="Happy Holidays";
    }
    public static void main(String[] args) {
    Message message=new Message();
    message.print();
    change(message);
    message.print();
    }
}
