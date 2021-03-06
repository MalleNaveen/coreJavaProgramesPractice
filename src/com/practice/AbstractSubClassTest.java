package com.practice;

public class AbstractSubClassTest extends AbstractClass{

	AbstractSubClassTest(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getDetailtest() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String arg[]){
		AbstractClass abs=new AbstractSubClassTest(1);	
	}
}
