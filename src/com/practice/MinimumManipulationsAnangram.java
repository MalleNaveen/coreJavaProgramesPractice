package com.practice;



//Java Program to find minimum number of manipulations
//required to make two strings identical
public class MinimumManipulationsAnangram {
	public static void main(String args[]) {
		makeAnagram("tea","ate");
    }
	
	/*
	 * Two words are anagrams of one another if their letters can be rearranged to form the other word.

In this challenge, you will be given a string. You must split it into two contiguous substrings, then determine the minimum number of characters to change to make the two substrings into anagrams of one another.

For example, given the string 'abccde', you would break it into two parts: 'abc' and 'cde'. Note that all letters have been used, the substrings are contiguous and their lengths are equal. Now you can change 'a' and 'b' in the first substring to 'd' and 'e' to have 'dec' and 'cde' which are anagrams. Two changes were necessary.

Function Description

Complete the anagram function in the editor below. It should return the minimum number of characters to change to make the words anagrams, or  if it's not possible.

anagram has the following parameter(s):

s: a string
Input Format

The first line will contain an integer, , the number of test cases.
Each test case will contain a string  which will be concatenation of both the strings described above in the problem.
The given string will contain only characters in the range ascii[a-z].

Constraints


 consists only of characters in the range ascii[a-z].
Output Format

For each test case, print an integer representing the minimum number of changes required to make an anagram. Print  if it is not possible.

Sample Input

6
aaabbb
ab
abc
mnop
xyyx
xaxbbbxx
Sample Output

3
1
-1
2
0
1
	 */
	public static void makeAnagram(String a,String b){
		
		int min_deletions=0;
		int[] a_frequencies=new int[26];
		int[] b_frequencies=new int[26];

		for(int i=0;i<a.length();i++)
		{
		char current_char=a.charAt(i);
		int char_to_int=(int)current_char;
		int position=char_to_int-(int)'a';
		a_frequencies[position]++;
		}

		 for(int i=0;i<b.length();i++)
		{
		char current_char=b.charAt(i);
		int char_to_int=(int)current_char;
		int position=char_to_int-(int)'a';
		b_frequencies[position]++;
		}

		for(int i=0;i<26;i++){
		int difference=Math.abs(a_frequencies[i]-b_frequencies[i]);
		min_deletions+=difference;
		}

		System.out.println(min_deletions);
	}
	}

