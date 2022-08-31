package com.knoldus.assignment;

/**
 * Question-9:
 * Write a program in Java to Print characters and
 * their frequencies of a string  in order of occurrence.
 *
 * Input: programming
 * Output:  p1r2o1g2a1m2i1n1
 * Note- a) Use efficient or best suited  Java Collection framework interfaces and classes.
 *       b) Use functional programming  means avoid use of for, while, do while loop.
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Solution:
 */
public class Question9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.next();
        Map<Character, Integer> dictionary = new LinkedHashMap<>();
//        String input = "programming";
        input.chars()
                .forEachOrdered(character -> {
                    if (dictionary.containsKey((char) character))
                        dictionary.put((char) character, dictionary.get((char) character) + 1);
                    else
                        dictionary.put((char) character, 1);
                });
        dictionary.forEach((d, v)-> System.out.print(" "+d.charValue() +""+v));
    }
}
