package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddNumberPrintUsingStreamAPI {
	
	/*
    --- Program: Print first non-repeating character in a string.
Eg: analogy , n will be the first non-repeating character
​
    --- Using filter print even and odd numbers
--- predicate to test if even or odd

	 */

	public static void main(String[] args) {
		
		printNonRepeat("aalogy");
		Integer[] tihNumbers = {1,2,4,5,6};
		printOddEven(tihNumbers);
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		 
		System.out.println("Print all numbers:");
		condition(list, (n)->true);
		 
		System.out.println("Print no numbers:");
		condition(list, (n)->false);
		 
		System.out.println("Print even numbers:");
		condition(list, (n)-> n%2 == 0 );
		 
		System.out.println("Print odd numbers:");
		condition(list, (n)-> n%2 == 1 );
		 
		System.out.println("Print numbers greater than 5:");
		condition(list, (n)-> n > 5 );
		 
		}
		 
		public static void condition(List<Integer> list, Predicate<Integer> predicate) {
		for(Integer n: list)  {
		if(predicate.test(n)) {
		System.out.println(n + " ");
		}
		}
	}
	
	
	public static void printNonRepeat(String str){
		for(Character ch:str.toCharArray()) {
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non repeat character = " + ch);
                break;
            }
		}
		
		
	
				
	}


public static void printOddEven(Integer arr[]){
	Predicate<Integer> isEven = n -> n % 2 == 0;
	Predicate<Integer> isOdd = n -> n % 2 != 0;
	List<Integer> numberList = Arrays.asList(arr);
	numberList.stream().forEach(
			n -> 
			{
			if(n%2!=0){
				System.out.println("odd="+n);
				
			}else{
				System.out.println("even="+n);
			}
					
			}
			);
	
	numberList.stream().filter(isEven)			
			.forEach(System.out::println);

	numberList.stream().filter(isOdd)			
			.forEach(System.out::println);
}
}

		
		
	