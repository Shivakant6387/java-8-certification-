package org.example.certificateExam1.exam6;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base1 {
    Base1() throws IOException {
        System.out.print(1);
    }
}

//class Derived extends Base1 {
//    Derived() throws FileNotFoundException {
//        System.out.print(2);
//    }
//}
public class Exam46 {
    public static void main(String[] args) throws Exception {
        new Derived();
    }

}
