package com.knoldus.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
    
    public static void main(String[] args) {
    
        /**
         * Question-2:
         * Instead of using for loop or while loop
         * use stream API and do it in a functional way.
         */
        List<String> collection = new ArrayList<>(
                Arrays.asList("A", null, "B", null, "C", "", "D"));
        
        Iterator<String> i = collection.iterator();
        while (i.hasNext()) {
            String s = i.next();
            if (s == null || s.isEmpty()) {
                i.remove();
            }
        }
        System.out.println("Result using while loop: "+collection);
    
        /**
         * Solution:
         * using java stream API.
         */
        List<String> collection1 = new ArrayList<>(
                Arrays.asList("A", null, "B", null, "C", "", "D"));
        
        List<String> result = collection1.stream()
                .filter(s ->  s!=null)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Result using stream API: "+result);
    }
}
