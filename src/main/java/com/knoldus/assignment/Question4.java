package com.knoldus.assignment;


/**
 * Question-4:
 * There is a function called processOrder which
 * takes 6 parameters. Is it a good practice? If not,
 * give the reason and what would be the best practice to follow?
 */

import java.math.BigDecimal;

/**
 * Answer:
 * It should be split into several smaller functions,
 * each which have a smaller parameter set.
 *
 * Break the method into multiple methods,
 * each which require only a subset of the parameters
 *
 * Create helper classes to hold group of
 * parameters (typically static member classes)
 *
 * It makes code easier to read.
 * it's more unit testable. You've split your
 * problem into several smaller tasks that are individually very simple.
 */
public class Question4 {
    public void processOrder(String customerCode, String CustomerName,
            String deliveryAddress, BigDecimal unitPrice, int quantity,
            BigDecimal discountPercentage) {
        System.out.println("");
    }
}
