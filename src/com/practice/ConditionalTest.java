package com.practice;

public class ConditionalTest {

	public static void main(String args[]){
		switchTest();
		 System.out.print("Y" + "O" +"\n"); 
	        System.out.print('L' + 'O'); 
	}
	
	public static void switchTest(){
		 String str = "Two"; 
	        switch(str) 
	        { 
	            case "one": 
	                System.out.println("one"); 
	                break; 
	            case "two": 
	                System.out.println("two"); 
	                break; 
	            case "three": 
	                System.out.println("three"); 
	                break; 
	            default: 
	                System.out.println("no match"); 
	        } 
	}
	
	
}
