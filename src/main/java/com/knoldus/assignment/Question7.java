package com.knoldus.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * Question-7:
 * The below code snippet results OutOfMemory or
 * reason for memory leak in the application.
 * Give reason Provide the best solution to avoid memory leak for such cases.
 */

/**
 * Solution:
 *  The memory leak occurs, when a piece of memory which was previously allocated by the programmer.
 *  Then it is not deallocated properly by programmer. That memory is no longer in use by the program.
 *  So that place is reserved for no reason. That's why this is called the memory leak.
 *
 *  A Memory Leak is a situation where there are objects present in the heap that are no longer used,
 *  but the garbage collector is unable to remove them from memory, and therefore, they're
 *  unnecessarily maintained.
 *
 *  A memory leak is bad because it blocks memory resources and degrades system performance over time.
 *
 *  Some points to prevent from memory leakage :
 *  Memory management is Java’s strongest suit and one of the many reasons developers choose
 *  Java over other platforms and programming languages.
 *
 *  On paper, you create objects, and Java deploys its garbage collector to allocate and free
 *  up memory.
 *  But that’s not to say Java is flawless. As a matter of fact, memory leaks happen, and they
 *  happen a lot in Java applications.
 */
public class Question7 {
    public void readStream()
            throws IOException, URISyntaxException {
        
        String str = "";
        URLConnection conn
                = new URL("https://blog.knoldus.com/").openConnection();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
        
        while (br.readLine() != null) {
            str += br.readLine();
        }
        System.out.println(str);
    }
    
    public static void main(String[] args) throws IOException, URISyntaxException {
        Question7 solution = new Question7();
        solution.readStream();
    }
    
}
