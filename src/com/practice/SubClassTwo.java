package com.practice;

import java.io.IOException;

public class SubClassTwo  extends SubClass{
	 public void fun() throws IOException{
	        System.out.println("Sub calls 2");
	    }
	public static void main(String[] args) throws IOException {
		InterfaceA a=new SubClassTwo();
		System.out.println(a.a);
		SuperClass sup=new SubClassTwo();
		sup.fun();
	}

}
