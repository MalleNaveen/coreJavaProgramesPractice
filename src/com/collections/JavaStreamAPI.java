package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamAPI {
    public static void main(final String args[]) {
    	  List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
    	    System.out.println("original list: " + numbers);
    	    List<Integer> even = numbers.stream()
    	                                .map(s -> Integer.valueOf(s))
    	                                .filter(number -> number % 2 == 0)
    	                                .collect(Collectors.toList());
    	    System.out.println("processed list, only even numbers: " + even);
        final List<String> test = new ArrayList<String>();
        test.add("naveen");
        test.add("malle");
        test.add("anisha");
        test.add("ravi");
        test.add("lavanish");

        final Stream<String> sApi = test.stream();
        final List<String> result = sApi.filter(a -> a.equals("anisha")).collect(Collectors.toList()); // filter
        // final List<String> result = sApi.sorted(test.c);
        for (final String s : result) {
            System.out.println(s);
        }
        final List<String> names = Arrays.asList("Katka", "Anisha", "John");

        final Object[] sortedNames = names.stream().sorted(String::compareTo).toArray();

        System.out.println("array: " + Arrays.toString(sortedNames));

    }
}
