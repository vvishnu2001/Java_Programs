package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,35,8,15);

        // External Iterator
        for(Integer number : numbers){
            System.out.println(number);
        }

        //Adding Elements greater than 7 to other list
        List<String> otherNumbers = new ArrayList<>();
        for(Integer number : numbers){
            if(number > 7){
                otherNumbers.add(String.valueOf(number));
            }
        }


        numbers.forEach(number -> System.out.println(number));                  //Internal Iterator

         numbers.forEach(System.out::println);                                   // Short form

        numbers.stream().map(number -> String.valueOf(number));

        List<String> numberStrings = numbers.stream()
                .filter(number -> number > 5)
                .filter(number -> number%2!=0)
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(numberStrings);
    }
}
