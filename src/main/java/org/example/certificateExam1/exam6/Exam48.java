package org.example.certificateExam1.exam6;
class Super1 {
    public String num = "10"; //Line n1
}

class Sub1 extends Super1 {
    protected int num = 20; //Line n2
}
public class Exam48 {
    public static void main(String[] args) {
       // Super1 obj = new Sub();
       // System.out.println(obj.num += 2); //Line n3
    }
}
