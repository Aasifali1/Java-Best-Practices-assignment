package com.knoldus.assignment;
import java.util.function.Function;

/**
 *     Question-1:
 *     The code snippet below, can throw a NullPointer exception.
 *     Give reason how it can throw a null pointer exception and
 *     what would be the best practice to avoid null pointer exception
 *     for such cases.
 */

/**
 *     Answer:
 *     First of all you have defined compareStringValues() method
 *     inside main method it is not possible in java to define
 *     a method directly inside a method. To achieve this, we
 *     should have a inner class or we can use a lambda expression.
 *
 *     Now the answer is that if we call compareStringValues method
 *     on null value then it will throw a null pointer exception.
 *     Please see the example below.
 */

public class Question1 {
    public static void main(String[] args) {
        Function<String, String> compareStringValues = (String value) -> {
            try{
                if (value.equals("MOM"))
                    return "MOM";
            }catch (NullPointerException ex){
                System.out.println("Null pointer exception occured");
            }
            return "DAD";
        };
//        Calling method on non-null values will return a desired output.
        System.out.println(compareStringValues.apply("MOM") + " cook food for me");

//        Calling method on null value will throw a NullPointerException
        System.out.println(compareStringValues.apply(null) + " cook food for me");
    
        /**
         * 1. To avoid null pointer exception we have to check
         *    the values before executing the method.
         *
         * 2. Instead of invoking the method from the null object,
         *    consider invoking it from the literal.
         *    Here "MOM" is literal and the value is an object.
         *    Please see the example below.
         *
         * 3. Or we can compare the Strings using == operator.
         */
    
        /**
         * program to demonstrate invoking method from literal.
         */
        Function<String, String> compareStringValuesTest = (String value) -> {
            if ("MOM".equals(value))
                return "MOM";
            else
                return "DAD";
        };
//        Calling method on null values will return a desired output now.
        System.out.println(compareStringValuesTest.apply(null) + " cook food for me");
    }
}

