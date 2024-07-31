package org.example;

public class CheckedExceptionExample extends Exception{

    public CheckedExceptionExample(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckedExceptionExample(Throwable cause) {
        super(cause);
    }

    public CheckedExceptionExample(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CheckedExceptionExample() {
        super();
    }

    public CheckedExceptionExample(String message) {
        super(message);
    }
}
