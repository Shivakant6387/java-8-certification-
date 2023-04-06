package org.example.certificateExam1.exam6;
interface I2 {
    int i = 20;
}
 interface I3 extends I1, I2 { //Line n1

}
public class Exam59 {
    public static void main(String[] args) {
      //  System.out.println(I1.i); //Line n2
        System.out.println(I2.i); //Line n3
        System.out.println(I3.i); //Line n4
    }
}
