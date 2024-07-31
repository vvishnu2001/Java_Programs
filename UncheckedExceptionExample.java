package org.example;

public class UncheckedExceptionExample extends RuntimeException {
    public UncheckedExceptionExample() {
    }

    public UncheckedExceptionExample(String message) {
        super(message);
    }

    public UncheckedExceptionExample(String message, Throwable cause) {
        super(message, cause);
    }

    public UncheckedExceptionExample(Throwable cause) {
        super(cause);
    }

    public UncheckedExceptionExample(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
