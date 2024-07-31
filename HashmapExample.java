package org.example;

import java.util.HashMap;
import java.util.Map;
public class HashmapExample {
        public static void main(String[] args) {
            Map<Employee,String> employeeStringMap=new HashMap<>();
            employeeStringMap.put(new Employee("Vishnu","41871"),"hashCode");
            employeeStringMap.put(new Employee("Jagadeesh","41868"),"hash");
            employeeStringMap.put(new Employee("Dilip","41964"),"Code");
            employeeStringMap.put(new Employee("Rajesh","41365"),"vvvjccgucc");
            System.out.println(employeeStringMap);
            for (Employee key : employeeStringMap.keySet()) {
                System.out.println(key);
            }
            for (String key : employeeStringMap.values()) {
                System.out.println(key);
            }

        }
    }

