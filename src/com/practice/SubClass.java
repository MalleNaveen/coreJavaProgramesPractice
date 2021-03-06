package com.practice;

import java.io.IOException;


public class SubClass extends SuperClass{
	//Exception Exception is not compatible with throws clause in SuperClass.fun()
	  public void fun() throws IOException{
	        System.out.println("Sub calls");
	    }
	  
	  public static void main(String args[]) throws IOException{
		  
		 SuperClass supeClass=new SubClass();
		 supeClass.fun();
		 InterfaceA a=new SubClass();
		  
	  }
}
