package org.example;

import java.util.Set;
import java.util.TreeSet;
public class TreeHashset {

        public static void main(String[] args) {
            Set<Employee> emp=new TreeSet<>(new EmployeeIdComparator());
            emp.add(new Employee("Vishnu","41863"));
            emp.add(new Employee("Jagadeesh","41966"));
            emp.add(new Employee("Dilip","41672"));
            System.out.println(emp);
        }


}
