package com.practice;

public class Test13 {

	final int i;
	
	public Test13(){
		i=0;
		System.out.println("Class Contructor");
	}
	//{} blank scope

    // Initializer block starts.. 
    { 
        // This code is executed before every constructor. 
        System.out.println("Common part of constructors invoked !!"); 
    } 
    
	/*{
	System.out.println("block");
	}
	*///static block will excute at class compile time only once
	static{
		System.out.println("static block");
	}
	//main method mandatory from jdk7 onwanrds
	public static void main(String[] args) {
		
		Test13 t1=new Test13();
		Test13 t2=new Test13();
		//Class c1=t1.getClass();
		
	}

}
