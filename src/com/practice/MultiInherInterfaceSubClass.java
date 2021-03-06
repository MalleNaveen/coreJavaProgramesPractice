package com.practice;

public class MultiInherInterfaceSubClass implements DefaultmethodMultiInherInterfaceOne,DefaultmethodMultiInherInterfaceTwo {

	//mandatory need to over default methods 
	@Override
	public void fun() {
		//this is way we need to call interface default methods.
		DefaultmethodMultiInherInterfaceOne.super.fun();
		DefaultmethodMultiInherInterfaceTwo.super.fun();
		System.out.println("Sub Class");
	}
	
	public static void main(String args[]){
		MultiInherInterfaceSubClass test=new MultiInherInterfaceSubClass();
		test.fun();
	}

}
