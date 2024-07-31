package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> Students = new ArrayList<>();

        Students.add("Vishnu");
        Students.add("Jagadeesh");
        Students.add("Dilip");
        Students.add("Jyothsna");
        Students.add("Akshya");
        Students.add("Malavika");

        System.out.println(Students);

        System.out.println(Students.contains("Vishnu"));

        System.out.println(Students.get(2));

        // For each loop
        for(String s : Students)
            System.out.println(s);

        // External Iterator
        for(int i=0;i<Students.size();i++)
            System.out.println(Students.get(i));
    }
}
