package com.knoldus.assignment;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Question-10:
 * Write a program in Java to implement a simple dictionary
 * with few letters/strings and print it in alphabetical order.	                                                                                             25
 *
 * Note- a) Use efficient or best suited  Java Collection framework interfaces and classes.
 *       b) Use functional programming  means avoid use of for, while, do while loop.
 */

/**
 * Solution:
 */
public class Question10 {
    public static void main(String[] args) throws InterruptedException {
        List<String> dictionary = Arrays.asList("Rahman", "Aasif", "Sameer","Pardeep", "Mayank", "Javed");
        System.out.println("Dictionary before sorted: "+dictionary);
        List<String> sortedDictionary = dictionary.stream()
                .sorted(Comparator.comparing(name -> name))
                .collect(Collectors.toList());
        System.out.println("Dictionary before sorted: "+sortedDictionary);
    }
}
