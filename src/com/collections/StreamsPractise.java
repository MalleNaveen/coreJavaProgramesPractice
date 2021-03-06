package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamsPractise {

	public static void main(String[] args) {
		// Creating list of integers 
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8); 
  
        // Finding sum of all elements 
        int sum = array.stream().reduce(0, 
                (element1, element2) -> element1 + element2); 
  
        // Displaying sum of all elements 
        System.out.println("The sum of all elements is " + sum); 
        
     // String array 
        String[] array1= { "Geeks", "for", "Geeks" }; 
  
        // The result of the reduce() method is 
        // an Optional because the list on which 
        // reduce() is called may be empty. 
        Optional<String> String_combine = Arrays.stream(array1) 
                                           .reduce((str1, str2) 
                                           -> str1 + "-" + str2); 
  
        // Displaying the combined String 
        if (String_combine.isPresent()) { 
            System.out.println(String_combine.get()); 
        } 
        
     // To get the product of all elements 
        // in given range excluding the 
        // rightmost element 
        int product = IntStream.range(2, 8) 
                     .reduce((num1, num2) -> num1 * num2) 
                     .orElse(-1); 

        // Displaying the product 
        System.out.println("The product is : " + product);
        
     // creating a list of Strings 
        List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                                           "GeeksQuiz", "GeeksforGeeks"); 
  
        // The lambda expression passed to 
        // reduce() method takes two Strings 
        // and returns the the longer String. 
        // The result of the reduce() method is 
        // an Optional because the list on which 
        // reduce() is called may be empty. 
        Optional<String> longestString = words.stream() 
                                   .reduce((word1, word2) 
                             -> word1.length() > word2.length() 
                                           ? word1 : word2); 
  
        // Displaying the longest String 
        longestString.ifPresent(System.out::println); 
	}
	
	


}
