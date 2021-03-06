package com.practice;

import java.io.Serializable;

public class SingleTonTest implements Serializable,Cloneable {
	
	public static volatile SingleTonTest INSTANCE=null;
	
	private SingleTonTest(){
		if(INSTANCE!=null){
			throw new RuntimeException("Cannot instantiate single object using constructor. Use its #getInstance() method");
		}
	}

	public static SingleTonTest getInstance(){
		if(INSTANCE==null){
			synchronized(SingleTonTest.class){
				if(INSTANCE==null){
					INSTANCE=new SingleTonTest();
				}
			}
		}
		return INSTANCE;
	}
	
	public Object readResolve() {
		
		return SingleTonTest.getInstance();
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("excepption");
		
	}
}
