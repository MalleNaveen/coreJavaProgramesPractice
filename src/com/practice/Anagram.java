package com.practice;


//JAVA program to check whether two strings 
//are anagrams of each other 
import java.io.*; 
import java.util.Arrays; 
import java.util.Collections; 

class Anagram { 
	
	

 /* function to check whether two strings are  
 anagram of each other */
 static boolean areAnagram(char[] str1, char[] str2) 
 { 
     // Get lenghts of both strings 
     int n1 = str1.length; 
     int n2 = str2.length; 

     // If length of both strings is not same, 
     // then they cannot be anagram 
     if (n1 != n2) 
         return false; 

     // Sort both strings 
     Arrays.sort(str1); 
     Arrays.sort(str2); 
     

     // Compare sorted strings 
     for (int i = 0; i < n1; i++) 
         if (str1[i] != str2[i]) 
             return false; 

     return true; 
 } 
 static void isAnagram(String str1, String str2) {  
     String s1 = str1.replaceAll("\\s", "");  
     String s2 = str2.replaceAll("\\s", "");  
     
     boolean status = true;  
     if (s1.length() != s2.length()) {  
         status = false;  
     } else {  
         char[] ArrayS1 = s1.toLowerCase().toCharArray();  
         char[] ArrayS2 = s2.toLowerCase().toCharArray();  
         ArrayS1=removeDuplicates(ArrayS1);
         ArrayS2=removeDuplicates(ArrayS2);
         Arrays.sort(ArrayS1);  
         Arrays.sort(ArrayS2);  
         status = Arrays.equals(ArrayS1, ArrayS2);  
     }  
     if (status) {  
         System.out.println(s1 + " and " + s2 + " are anagrams");  
     } else {  
         System.out.println(s1 + " and " + s2 + " are not anagrams");  
     }  
 }
 private static char[] removeDuplicates(char[] origArray) {
	 
     for (int i = 0; i < origArray.length - 1; i++)
     {
         if (origArray[i] == origArray[i + 1]) {
             origArray[i] = 0;
         }
     }
      
     return origArray;
 }
 /* Driver program to test to print printDups*/
 public static void main(String args[]) 
 { 
	 
	 isAnagram("Keep", "Peek");  
     isAnagram("Mother In Law", "Hitler Woman");
     char str1[] = { 't', 'e', 's', 't' ,'t'}; 
     char str2[] = { 't', 't', 'e', 'w' }; 
     if (areAnagram(str1, str2)) 
         System.out.println("The two strings are"
                            + " anagram of each other"); 
     else
         System.out.println("The two strings are not"
                            + " anagram of each other"); 
 } 
} 