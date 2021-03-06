package com.practice;

public class MethodOverLoad {
	
	public static void main(String args[]){
		MethodOverLoad methodOverLoad=new MethodOverLoad();
		int res=methodOverLoad.overLoad(1);
		float res1=methodOverLoad.overLoad(1,2);
		System.out.println(res +"= "+res1);
	}
	
	public int overLoad(int a){
		return 1;
	}
	public float overLoad(int a,int b){
		float c=a+b;
		return c;
	}

}
