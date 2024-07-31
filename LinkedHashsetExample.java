package org.example;

import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashsetExample {
        public static void main(String[] args) {
            Set<Employee> Linked_hash=new LinkedHashSet<>();
            Linked_hash.add(new Employee("Vishnu","41871"));
            Linked_hash.add(new Employee("Jagadeesh","41868"));
            Linked_hash.add(new Employee("Diiip","41863"));
            Linked_hash.add(new Employee("Rajesh","41865"));
            System.out.println(Linked_hash);

        }


}
