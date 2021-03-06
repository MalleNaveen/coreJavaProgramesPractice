package com.oopsandexceptions;

import com.practice.Test;

public class ObjectOverload {
	
	public static void main(String args[]){
		
		ObjectOverload obj=new ObjectOverload();
		
		//string and object both are accept null so it is ambibuty
		//The method objectOverLoad(Object) is ambiguous for the type ObjectOverload
		//obj.objectOverLoad(null);
		//obj.objectOverLoad(new Double(0));//it will call object other than existing over load type
		
		obj.objectOverLoad(new String());//if string then taks string
		obj.objectOverLoad(new Integer(1));//if  int then taks it
		obj.objectOverLoad(new Object());//if object it will take object call
		
		obj.objectOverLoad(2);
		obj.objectOverLoad(new Test());//if object type matches same then i will call same overload class
	}
	
	public void objectOverLoad(Object a){
		
		System.out.println("object=" +a);
	}
public void objectOverLoad(String b){
		
		System.out.println("String=" +b);
	}
public void objectOverLoad(Integer i){
	
	System.out.println("Integer=" +i);
}
public void objectOverLoad(Test i){
	
	System.out.println("Test obj=" +i);
}
}
