package org.example;
import java.util.*;
class EmployeeIdComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Employee s1=(Employee) o1;
        Employee s2=(Employee) o2;

        return s1.getId().compareTo(s2.getId());
    }
}


