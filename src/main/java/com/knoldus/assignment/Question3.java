package com.knoldus.assignment;

/**
 * Question-3:
 * When can a Java class be marked as final?
 * What does it mean when a class is marked as final?
 */

/**
 * Solution:
 * A final class is simply a class that can't be extended.
 * when you want to prevent inheritance of a class, for security reasons.
 * This allows you to make sure that code you are running cannot be overridden by someone.
 *
 * Standardization: Some classes perform standard
 * functions and they are not meant to be modified
 * e.g. classes performing various functions related
 * to string manipulations or mathematical functions etc.
 *
 * Security reasons: Sometimes we write classes which perform
 * various authentication and password related functions, and we
 * do not want them to be altered by anyone else.
 */

public final class Question3 {
    public static void main(String[] args) {
        System.out.println("This class can not be extended");
    }
}
