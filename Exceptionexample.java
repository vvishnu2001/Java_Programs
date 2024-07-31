package org.example;

import java.io.IOException;

public class Exceptionexample {
    public static void main(String[] args) {
        Connection connection = new Connection();
        try {
            connection.getConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
