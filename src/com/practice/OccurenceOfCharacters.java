package com.practice;

import java.util.Scanner;

public class OccurenceOfCharacters {
    private static Scanner scan = null;

    public static void main(final String[] args) {
        scan = new Scanner(System.in);
        String str = null;
        System.out.println("Enter String : ");
        str = scan.nextLine();

        final int[] count = new int[255];

        final int length = str.length();

        for (int i = 0; i < length; i++) {
            count[str.charAt(i)]++;
        }

        final char[] ch = new char[str.length()];
        for (int i = 0; i < length; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j]) {
                    find++;
                }
            }

            if (find == 1) {
                System.out.println("Number of Occurrence of " + str.charAt(i) + " letter is:" + count[str.charAt(i)]);
            }
        }
    }
}
