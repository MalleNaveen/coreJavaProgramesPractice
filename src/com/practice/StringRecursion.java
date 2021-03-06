package com.practice;

public class StringRecursion {

    public static void main(final String args[]) {

        final String abc = "ABCD";
        final StringRecursion test345 = new StringRecursion();
        final String tmp = test345.getTest(abc, abc.length());
        System.out.println(tmp);
    }

    public String getTest(final String str, int count) {

        if (count != 0) {
            String tmp = "";
            count--;
            for (int i = 1; i < str.length(); i++) {
                tmp = tmp + str.charAt(i);
            }
            tmp = tmp + str.charAt(0);
            System.out.println(tmp);
            return getTest(tmp, count);
        }

        return "";
    }
}
