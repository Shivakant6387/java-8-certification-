package org.example.certificateExam1;
class Point1 {
    int x;
    int y;
    void assign(int x, int y) {
        x = this.x;
        this.y = y;
    }

    public String toString() {
        return "Point1(" + x + ", " + y + ")";
    }
}
public class Exam55 {
    public static void main(String[] args) {
        Point1 p1 = new Point1();
        p1.x = 10;
        p1.y = 20;
        Point p2 = new Point();
        p2.assign(p1.x, p1.y);
        System.out.println(p1.toString() + ";" + p2.toString());
    }
}
