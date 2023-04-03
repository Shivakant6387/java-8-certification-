package org.example.certificateExam1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Employees {
    private String name;
    private int age;
    private double salary;

    public Employees(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name;
    }
}
public class Exam22 {
    public static void main(String[] args) {
        List<Employees>list=new ArrayList<>();
        list.add(new Employees("James",25,15000));
        list.add(new Employees("Lucy",23,12000));
        list.add(new Employees("Bill",27,10000));
        list.add(new Employees("Jack",19,5000));
        list.add(new Employees("Liya",20,8000));
        process(list, employee -> employee.getSalary()>=10000);

        System.out.println(list);
    }
    private static void process(List<Employees> list, Predicate<Employees> predicate) {
        Iterator<Employees> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(predicate.test(iterator.next()))
                iterator.remove();
        }
    }
}
