package org.example;

import com.sun.javaws.exceptions.InvalidArgumentException;
import sun.plugin.dom.exception.InvalidAccessException;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(18);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught:" + e.getMessage());
        }
    }

        public static void checkAge(int age)
        {
            if(age<18)
            {
                throw new IllegalArgumentException("Age must be 18 or older");
            }
            System.out.println("Age is Valid");
        }
}
