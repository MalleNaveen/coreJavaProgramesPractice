package com.practice;

import java.util.ArrayList;
import java.util.List;

//cannot add final to the abstract class
public abstract  class AbstractClass {
	//But, if a class has at least one abstract method, then the class must be declared abstract.
	abstract void getDetailtest();
	public static void getDetails(){
		System.out.println("abstract static");
	}
	
	public  void getDetailsAdd(){
		System.out.println("abstract ");
	}
	
	AbstractClass(){
		
	}
	
	//if default constructor needs for abstract class other wise sub class need to have parameterized constructor.
	AbstractClass(int a){
		
	}
	char f=0;
	float f1=2.0f;// float mandatory f
	double d=230.0;
	long l=2;
	int i=2000;
	short s=4677;
	byte b=127;
	
	int a[]={1,2,3};
	int[][] a1=new int[1][2];
	
	List<?> t=new ArrayList<Integer>();
	
	List<?> t2=new ArrayList<Number>();
	List<? extends Number> t4=new ArrayList<Integer>();
	List<? extends Number> t5=new ArrayList<Number>();
	
	
	
	
	
	
}
