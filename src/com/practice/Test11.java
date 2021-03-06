package com.practice;

public class Test11 {
	
	public static void main(String args[]){
		getTest11();
		//Java Examples - Producer Consumer Problem
		//NoClassDefFoundError is an error that is thrown when the Java Runtime System tries to load the definition of a class
	//ClassNotFoundException is a runtime exception that is thrown when an application tries to load a class at runtime using the Class.forName() or loadClass() or findSystemClass() methods
	//create own cache --> best collection is concurrent hashmap /hashmap	
		//Mark-and-Sweep: Garbage Collection Algorithm -->Advantages of Mark and Sweep Algorithm
		//Java.util.concurrent.CyclicBarrier in Java
//	/when should we use prototype scope in spring 
		//Prototype bean is created at the time of usage. So when you would like to have statefull beans there is strong need sometimes to have prototypes scope or when you don't wont to cache any values in beans. Prototype bean can be associated with one session or some call.
	//how to merge multiple commits in git
	//how to undo commits and delete files in git
		//for(;;) infinite loop
		//exception propagation in java -> only unchecked exceptions will configure this one
		//locationsation in java
		//class loaders -> Bootstrap loader,application loader and extn loader. 
	}

	
	public static void getTest11(){
		
		
	for(int j=0;j<6; j++){
		System.out.println("while" +j);
		for(int i=0;i<5;i++){
			System.out.println("for" +i);
			if(i==0){
				break;
			}else
			{ 
				break;//continue;
			
			}
		}
		break;
	}
		
	}
}
