package com.knoldus.assignment;

/**
 * Question-8:
 * Can we catch Throwable? Is it recommended or best practice to catch Throwable?
 * If not, give a  valid reason with an example.
 */

/**
 * yes we can catch the throwable, but we should never do it.
 * Throwable is the superclass of all exceptions and errors.
 * If you use Throwable in a catch clause,
 * it will not only catch all exceptions, it will also catch all errors.
 * Errors are thrown by the JVM to indicate serious
 * problems that are not intended to be handled by an application.
 * Typical examples for that are the OutOfMemoryError or the StackOverflowError.
 */
public class Question8 {
    public static void catchThrowable() {
        try {
            int result = 2/0;
        } catch(Throwable t) {
            System.out.println("Exception occured: "+t.getMessage());
        }
    }
    public static void main(String[] args) {
        catchThrowable();
    }
}

/**
 * Solution program
 */

class Solution8 {
    public static void catchException() {
        try {
            int result = 2/0;
        } catch(ArithmeticException arithmeticException) {
            System.out.println("Exception occured: "+arithmeticException.getMessage());
        }
    }
    public static void main(String[] args) {
        catchException();
    }
}
