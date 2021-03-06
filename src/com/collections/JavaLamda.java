package com.collections;

import java.util.ArrayList;

interface Addable {
    int add(int a, int b);
}

public class JavaLamda {
    public static void main(final String args[]) {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        final ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        // Multiple parameters in lambda expression
        final Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        final Addable ad2 = (final int a, final int b) -> (a + b);
        System.out.println(ad2.add(100, 200));

        // Using lambda expression to print all elements
        // of arrL
        // arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }

}
