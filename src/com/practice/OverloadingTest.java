package com.practice;

/*
 * Overloading: Overloading is also a feature of OOP languages like Java that is related to compile-time (or static)
 *  polymorphism. This feature allows different methods to have the same name, but different
 *  signatures, especially the number of input parameters and type of input parameters
 */

//number of parameters and types of parameters is the should not be same.
public class OverloadingTest {

	public static void main(String[] args) {
		
		byte a = 25; 
		OverloadingTest obj = new OverloadingTest(); 
        obj.show(a); // it will go to 
        // byte argument 
        obj.show("hello"); // String 
        obj.show(250); // Int 
        obj.show('A'); // Since char is 
        // not available, so the datatype 
        // higher than char in terms of 
        // range is int. 
        obj.show("A"); // String 
       // obj.show(7.5); // since float datatype 
// is not available and so it's higher 
// datatype, so at this step their 
// will be an error
       String s= obj.function("test",12);
        String s2=obj.function(12,"test");
System.out.println(s+s2);
OverloadingTest.foo(); 
OverloadingTest.foo(10); 
	}
	
	public static void foo() { 
        System.out.println("Test.foo() called "); 
    } 
    public static void foo(int a) {  
        System.out.println("Test.foo(int) called "); 
    } 
	private String function(String temp, int data) 
    { 
        return ("GFG"); 
    } 
    private String function(int data, String temp) 
    { 
        return ("GeeksforGeeks"); 
    } 
	/* public int getData() //getdata() 1 
	    { 
	        return 0; 
	    } 
	    public long getData() //getdata 2 
	    { 
	        return 1; 
	    }*/ 
	public void show(int x) 
    { 
        System.out.println("In int" + x); 
    } 
	public int show(int x,float y) 
    { 
        System.out.println("In int" + x); 
        return 1;
    } 
    public void show(String s) 
    { 
        System.out.println("In String" + s); 
    } 
    public void show(byte b) 
    { 
        System.out.println("In byte" + b); 
    } 
    public void show(Object b) 
    { 
        System.out.println("In obj byte" + b); 
    } 
    
    
    
}
