package org.example.certificateExam1.exam6;

 interface Buyable {
    int salePercentage = 85;

    public static String salePercentage() {
        return salePercentage + "%";
    }
}
class Book implements Buyable {}
public class Exam14 {
    public static void main(String[] args) {
        Buyable [] arr = new Buyable[2];
        for(Buyable b : arr) {
            System.out.println(b.salePercentage); //Line n1
         //   System.out.println(b.salePercentage()); //Line n2
        }

        Book [] books = new Book[2];
        for(Book b : books) {
            System.out.println(b.salePercentage); //Line n3
           // System.out.println(b.salePercentage()); //Line n4
        }
    }
}
