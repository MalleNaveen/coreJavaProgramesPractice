package com.practice;

// Java code to alternatively merge two strings.
public class MergeString {
    public static void main(final String[] args) throws MyException {
        final String s1 = "geeks";
        final String s2 = "forgeeks";
        System.out.println(merge(s1, s2));
    }

    // function for merging two strings
    public static String merge(final String s1, final String s2) throws MyException {
        final StringBuilder finalString = new StringBuilder();

        /* append character to final string from the two strings */
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {

            finalString.append(s1.charAt(i++));
            finalString.append(s2.charAt(j++));
        }

        /*
         * check if both the strings are traversed and if not then append remainder of that string to the final string
         */
        if (i != s1.length()) {
            finalString.append(s1.substring(i));
        }
        if (j != s2.length()) {
            finalString.append(s2.substring(j));
        }
        return finalString.toString();
    }
}
