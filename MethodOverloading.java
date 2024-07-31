package org.example;


class Addition
{
    public int add(int a,int b)
    {
        return a+b;
    }

    public int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public double add(double a,double b)
    {
        return a+b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Addition sum = new Addition();
        System.out.println(sum.add(3,4));
        System.out.println(sum.add(3,6,9));
        System.out.println(sum.add(1.5,6.5));
    }
}
