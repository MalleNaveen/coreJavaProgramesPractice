package com.oopsandexceptions;

public class Java8ClassAndInterfaceDiffTest  extends MultipleInterfaceInClass implements Java8InterfaceOne{

	
	public static void main(String arrgs[]){
		Java8ClassAndInterfaceDiffTest test=new Java8ClassAndInterfaceDiffTest();
		//if both interface and class have same method then it will interfacemethod so class method has more priorty
		test.classmethodhidesinterfacedefaultmethodifsame();
		test.statictest();
		//interface static method only accessible through interface name
		Java8InterfaceOne.statictest();
	}
}


