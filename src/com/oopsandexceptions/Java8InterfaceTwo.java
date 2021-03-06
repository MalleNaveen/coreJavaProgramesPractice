package com.oopsandexceptions;

public interface Java8InterfaceTwo {
	void add();
	default void show(){
		int a=20;
		System.out.println("java8 interfaceotwo"+a);
		
	}
	
	// default method can't override any class methods already available 
	//A default method cannot override a method from java.lang.Object 
	/*default boolean equals(Object obj){
		return true;
	}
*/
}
