package com.practice;

public class ChildClass extends ParentClass{
	
	public static void main(String arg[]){
		ParentClass parent=new ChildClass();
		ParentClass parentClass=new ParentClass();
		parent.add(1);
		ChildClass child1=new ChildClass();
		child1.add(1);
		parentClass.add(1);
	}
	 // private methods are not overridden 
private void m1() { System.out.println("From parent m1()");} 
public int add(int a){
		System.out.println("child");
		return 1;
		
	}

public Child add(double a){
	System.out.println("parent");
	Child child=new Child();
	return child;
	
}

}
