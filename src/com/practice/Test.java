package com.practice;

public class Test implements InterfaceA {
	
public void fly(){
	System.out.println("sub test");
}
	public static void main(String[] args) {
		InterfaceA intr=new Test();
		intr.fly();
		String s1="abc";
		s1+="d";
		String s2=s1;
		String s3=new String("abcd");
		System.out.println(s1+" "+s2+"= " + (s1==s2));
		StringBuffer str=new StringBuffer();
		str.append("d");
		StringBuffer str1;
		str1=str;		
		System.out.println(str==str1);
		System.out.println(s3.equals(s1));
		System.out.println(s3==s1);
	}

}
