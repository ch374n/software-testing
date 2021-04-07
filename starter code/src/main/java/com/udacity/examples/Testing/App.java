package com.udacity.examples.Testing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );
        Thread t1 = new Thread(() -> System.out.println("hello"));
        Thread t2 = new Thread(() -> System.out.println("world"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("end of main...");
    }
}
