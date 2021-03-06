package com.practice;

import java.util.Scanner;

public class SnakeProblem {

	public static void main(String[] args) {
		  int num=0,i,j;
	      System.out.println("Input your number and press enter: ");
	      //This statement will capture the user input
	      Scanner in = new Scanner(System.in);
	      //Captured input would be stored in number num
	      num = in.nextInt();
	      int column = in.nextInt();
	      System.out.println(num);
	      int array[][] = new int[num][column];
	  	System.out.println("Enter matrix:");
	   	for(i = 0; i < num; i++)
	    	{
	     	    for(j = 0; j < column; j++) 
	       	    {
	          	array[i][j] = in.nextInt();
	          	System.out.print(" ");
	              }
	    	}
	  	System.out.println("The above number clockwise growth untill reaches to given number square ");
	    	for(i = 0; i < num; i++)
	      	{
	        	    for(j = 0; j < column; j++)
	              {
	            	System.out.print(array[i][j]+" ");
	              }
	              System.out.println(" ");
	          }
	    	
	   
	  
	}
}


