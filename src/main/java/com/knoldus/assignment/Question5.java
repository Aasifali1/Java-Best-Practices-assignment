package com.knoldus.assignment;

/**
 * Question-5:
 * What is the correct way to check empty strings according to you and why?
 */

/**
 * Answer:
 * If we compare check null values on isEmpty
 * method then it returns false that's not a desired output.
 *
 * similarly if we check null on second isEmpty(isEmptyStr) method
 * then it throws a null pointer exception, or if we check whitespace
 * then it returns false that's not a desired output,
 * it should return true in both the cases.
 *
 */
public class Question5 {
    public static boolean isEmpty(String str) {
        return "".equals(str);
    }
    public static boolean isEmptyStr(String str) {
        return str.length() == 0;
    }
    public static void main(String[] args) {
        System.out.println("String check before solution");
        System.out.println("Is string empty on null: "+isEmpty(null));
        System.out.println("Is string empty on whitespace: "+isEmptyStr(" "));
    }
}

/**
 * Both String#isEmpty and String#length can be used to check for empty strings.
 * If we also want to detect blank strings, we can achieve this with the help of String#trim.
 * as of Java 11, we can also use the isBlank() method instead of trimming:
 */
class Solution5{
    public static boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
    public static void main(String[] args) {
        System.out.println("******************* Solution ******************************");
        System.out.println("Is string empty on null: "+isEmpty(null));
        System.out.println("Is string empty on whitespace: "+isEmpty(" "));
        System.out.println("Is string empty on non-empty: "+isEmpty("Aasif"));
    }
}