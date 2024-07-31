package org.example;

import java.util.*;

class Student
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
public class ComparatorExample {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
               if(i.age > j.age)
                   return 1;
               else
                   return -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21,"Vishnu"));
        studs.add(new Student(22,"Rajesh"));
        studs.add(new Student(20,"Dilip"));
        studs.add(new Student(23,"Jagadeesh"));

        //System.out.println(studs);

        Collections.sort(studs,com);

        for(Student s: studs)
            System.out.println(s);

    }
}
