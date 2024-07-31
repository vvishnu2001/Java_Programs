package org.example;

import java.util.*;

class Student1 implements Comparable<Student1>
{
    int age;
    String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo(Student1 stu) {
        if(this.age > stu.age)
            return 1;
        else
            return -1;
    }
}
public class ComparableExample {
    public static void main(String[] args) {

        List<Student1> studs1 = new ArrayList<>();
        studs1.add(new Student1(21,"Vishnu"));
        studs1.add(new Student1(22,"Rajesh"));
        studs1.add(new Student1(20,"Dilip"));
        studs1.add(new Student1(23,"Jagadeesh"));

        //System.out.println(studs);

        Collections.sort(studs1);

        for(Student1 s: studs1)
            System.out.println(s);

    }
}
