package com.practice;

public class StaticBlockAndInitilizeBlock {

	//it will call every time object creation
	{
		System.out.println("Initilize Block");
	}
	//it will call only once when you run the class.
	static{
		System.out.println("Static Block");
	}
	public StaticBlockAndInitilizeBlock(){
		System.out.println("constructor");
	}
	public static void staticMethod(){
		System.out.println("Static Method");
	}
	public void getInstanceMethod(){
		System.out.println("Instance Method");
	}
	public static void main(String[] args) {

		StaticBlockAndInitilizeBlock obj1=new StaticBlockAndInitilizeBlock();
		StaticBlockAndInitilizeBlock obj2=new StaticBlockAndInitilizeBlock();
		obj1.getInstanceMethod();
		obj2.getInstanceMethod();
		staticMethod();
		staticMethod();
	}

}
