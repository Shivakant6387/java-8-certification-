package org.example.certificateExam1.exam6;

public class Exam1 {
    public static void main(String[] args) {
        for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
            System.out.println(x + y + z);
        }
    }
}
