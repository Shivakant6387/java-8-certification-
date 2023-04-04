package org.example.certificateExam1.exam2;
abstract class Helper {
    int num = 100;
    String operation = null;

    protected abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}
public class Exam26 extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

//    private int num = 200;
//    protected String operation = "LOGGING";

    public void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new Exam26().help();
    }
}

