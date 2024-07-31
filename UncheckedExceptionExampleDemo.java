package org.example;

import javax.sound.midi.Soundbank;

public class UncheckedExceptionExampleDemo {
    public static void main(String[] args) {
        try{
            getUncheckedException();
        }
        catch(UncheckedExceptionExample e)
        {
            System.out.println("Caught Custom UnChecked Exception"+e.getMessage());
        }

    }

    private static void getUncheckedException() throws UncheckedExceptionExample{
        System.out.println("This is a Unchecked Custom Exception");
    }
}
