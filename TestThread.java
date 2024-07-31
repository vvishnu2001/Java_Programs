package org.example;

public class TestThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override                                                                 // Normal Expression
            public void run() {
                System.out.println("In another thread");
            }
        });

        Thread thread1 = new Thread(() -> System.out.println("In another Thread"));      // Lambda Expression

        thread.start();
        System.out.println("In main Thread");


    }
}
