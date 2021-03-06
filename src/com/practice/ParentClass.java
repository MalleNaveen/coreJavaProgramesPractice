package com.practice;

public class ParentClass {
	 // private methods are not overridden 
    private void m1() { System.out.println("From parent m1()");} 
	public int add(int a){
		System.out.println("parent");
		return 1;
		
	}
	public Parent add(double a){
		System.out.println("parent");
		Parent parent=new Parent();
		return parent;
		
	}

}
