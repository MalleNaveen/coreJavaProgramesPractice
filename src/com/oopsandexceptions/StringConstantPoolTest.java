package com.oopsandexceptions;

public class StringConstantPoolTest {
	
	public static void main(String args[]){
		String a="abc";
		String b="abc";
		String c=new String("abc");
		System.out.println(a.hashCode()+"="+b.hashCode()+"="+c.hashCode());
	}

}
