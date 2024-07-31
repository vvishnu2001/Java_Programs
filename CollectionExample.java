package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectionExample {
    public static void main(String[] args) {
//    List<Integer> numbers = new ArrayList<>();
        Set<String> names = new HashSet<>();
        names.add("Vishnu");
        names.add("Vishnu");
        names.add("Pandu");
        names.add("Raju");
        System.out.println(names);

        String s1 = "Vishnu";
        String s2 = "Vishnu";
        if(s1.equals(s2))
        {
            System.out.println("Both are equal");
        }

        Employee employee = new Employee("Vishnu",40781);
        Employee employee1 = new Employee("Vishnu",40781);
        if(employee.equals(employee1))
        {
            System.out.println("Both Employees are equal");
        }
    }

}
