package org.example;

public class AnimalException extends RuntimeException{
    public AnimalException(String message, Throwable cause) {
        super(message, cause);
    }
}
