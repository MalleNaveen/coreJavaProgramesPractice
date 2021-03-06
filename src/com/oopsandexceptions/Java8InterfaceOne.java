package com.oopsandexceptions;

public interface Java8InterfaceOne {
	
	void add();
	default void show(){
		int a=10;
		System.out.println("java8 interfaceone"+a);
		
	}
	default void classmethodhidesinterfacedefaultmethodifsame(){
		System.out.println("classmethodhidesinterfacedefaultmethodifsame interface");
	}
	static void statictest(){
		System.out.println("interface static method");
	}

}
