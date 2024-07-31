package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {

        List<Person> persons = loadPersons();
        List<Person> otherPersons = persons.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println(otherPersons);

        System.out.println();

        Map<String, Person> personMap=otherPersons.stream()
                .collect(Collectors.toMap(Person::getName,person->person));
        System.out.println(personMap);

        List<Person> p=loadPersons();
        Map<Integer, List<Person>> result =p.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(result);

        Person finding = persons.stream()
                .filter(person -> person.getName() .startsWith("Ja"))
                .findFirst()
                .orElse(null);
        System.out.println(finding);

        Person finding1 = persons.stream()
                .filter(person -> person.getName() .startsWith("Ja"))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("There is no Person starting with 'Ja'"));
        System.out.println(finding1);


        //Implementation before Java8
        Map<String,List<Person>> designation=new HashMap<>();
        for(Person person:persons)
        {
            List<Person> personList=null;
            if(designation.containsKey(person.getDesignation()))
            {
                personList=designation.get(person.getDesignation());
            }
            else{
                personList=new ArrayList<>();
                designation.put(person.getDesignation(),personList);
            }
            personList.add(person);
        }
        System.out.println(designation);
        //Java 8
        List<Person> per=loadPersons();
        Map<String, List<Person>> result1 =per.stream()
                .collect(Collectors.groupingBy(Person::getDesignation));
        System.out.println(result);


    }


    private static List<Person> loadPersons(){
        List<Person> personlist=new ArrayList<>();
        personlist.add(new Person("Vishnu",20, "ASE"));
        personlist.add(new Person("Jagadeesh",21, "SE"));
        personlist.add(new Person("Jagan",25,"ASE"));
        personlist.add(new Person("Dileep",22, "ASE"));
        personlist.add(new Person("Rajesh",23, "ASE"));
        return personlist;

    }
}

