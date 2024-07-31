package org.example;

class Animal
{
    public void sound()
    {
        System.out.println("Animal makes Sound");
    }
}

class Dog extends Animal
{
    public void sound()
    {
        System.out.println("Dog makes sound by barking");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Animal dog = new Dog();

        //animal.sound();
        dog.sound();
    }
}
