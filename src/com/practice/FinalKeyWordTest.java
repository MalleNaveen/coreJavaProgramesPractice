
package com.practice;

import java.util.ArrayList;

public class FinalKeyWordTest {
	//blank final variable can be initialized inside instance-initializer block or inside constructor.
	final int a;
    final String b=null;	
    final float c=2;
    final TestPojo test=null;
    final ArrayList<String> ab=new ArrayList<String>();
    //When a final variable is a reference to an object, then this final variable is called reference final variable.
    final StringBuffer sb=new StringBuffer();
    final static int s;
 // Instance Initialization Block  
    { 
    	a=30;
        System.out.println("IIB block"); 
    } 
    public FinalKeyWordTest() {
    	  System.out.println("constructor block"); 
	}
    
    static{
    	//A blank final static variable can be initialized inside static block.
    s=40;
    System.out.println("static block");
    }

	public static void main(String[] args) {
		FinalKeyWordTest test=new FinalKeyWordTest();
		// a final reference variable sb 
        final StringBuilder sb = new StringBuilder("Geeks"); 
        System.out.println(sb); 
          
        // changing internal state of object 
        // reference by final reference variable sb 
        sb.append("ForGeeks"); 
          
        System.out.println(sb); 
    }     
	
	

	public void getFinal(){
		ab.add("test");
		ab.add("test2");
	}
	
	public void getFinal2(){
		ab.add("test45");
	}
}
