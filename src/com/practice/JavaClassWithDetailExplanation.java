package com.practice;

public class JavaClassWithDetailExplanation {

	
	int a;// global variable
	final int b; // final variable
	static int c;// static variable
	public JavaClassWithDetailExplanation() {
		b=40;
	}
	//main method
	public static void main(String args[]) {
		
	}
 //static final method
	public  final void getSum() {
 int db=20;//local variable 
 
 System.out.println(db);
	}
//static method
	public static  void getSum(int a) {

	}
//public mehtod
	public void getAdd(int c) {

	}

	public void getAdd(float g) {

	}
//parameterized method
	public int getMinus(float g) {

		return 1;
	}
//method overloading
	public float getMinus(float g, float s) {

		return 0;
	}

}
