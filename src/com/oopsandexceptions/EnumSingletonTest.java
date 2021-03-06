package com.oopsandexceptions;

public class EnumSingletonTest {

	public static void main(String[] args) {
		
		SingletonWithEnums one=SingletonWithEnums.INSTANCE;
		SingletonWithEnums two=SingletonWithEnums.INSTANCE;
System.out.println(one.hashCode());
System.out.println(two.hashCode());
	}

}
