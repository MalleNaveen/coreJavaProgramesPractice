package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

class JavaCollections {
    public static void main(final String args[]) {
        final JavaCollections test = new JavaCollections();
        //test.streamTest();
        final String s1 = "Test";
        final String s2 = "Test";
        final String s3 = new String("Test");
        final String s4 = s3.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
        //test.collectionTest("welcome");
    }

    /*public void streamTest() {

        final List<String> items = new ArrayList<String>();

        items.add("one");
        items.add("two");
        items.add("three");
        final Stream<String> stream = items.stream();
        final Stream<String> stringStream = stream.map((value) -> {
            return value.toLowerCase();
        });
        System.out.println(stringStream.count());

    }

    public void collectionTest(final String inputString) {
        // Creating a HashMap containing char as a key and occurrences as a value

        final HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Converting given string to char array

        final char[] strArray = inputString.toCharArray();

        // checking each char of strArray

        for (final char c : strArray) {
            if (charCountMap.containsKey(c)) {
                // If char is present in charCountMap, incrementing it's count by 1

                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value

                charCountMap.put(c, 1);
            }
        }

        // Printing the charCountMap

        System.out.println(charCountMap);
    }
*/
}
