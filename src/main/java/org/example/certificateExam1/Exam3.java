package org.example.certificateExam1;
class A{
    public void print(){
        System.out.println("A");
    }
}
class B extends A{
    public void print(){
        System.out.println("B");
    }
}
public class Exam3 {
    public static void main(String[] args) throws ClassCastException {
        try {
        A obj1=new A();
        B obj2= (B) obj1;
        obj2.print();
    }catch (ClassCastException e){
        System.out.println(e);
    }

    }
}
