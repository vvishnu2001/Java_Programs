package org.example;

import java.util.ArrayList;

public class CheckedExceptionExampleDemo {

    public static void main(String[] args)  {
        try{
            getSomething();
        }
        catch(CheckedExceptionExample e){
            System.out.println("Caught Custom Checked Exception");
        }
        //getSomething();

    }
    private static void getSomething() throws CheckedExceptionExample{
        throw new CheckedExceptionExample("This is a Custom Checked Example");


    }
}

