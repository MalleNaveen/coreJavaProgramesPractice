package com.oopsandexceptions;

public class MultipleInterfaceInClass  implements Java8InterfaceOne,Java8InterfaceTwo{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("sub");
		
	}

//Duplicate default methods named show with the parameters () and () are inherited from the
	//types Java8InterfaceTwo and Java8InterfaceOne
	
	/*
	 * (non-Javadoc)
	 * @see com.oopsandexceptions.Java8InterfaceOne#show()
	 */
	@Override
	public void show() {
		// TODO Auto-generated method stub
		//Java8InterfaceTwo.super.show();
		//Java8InterfaceOne.super.show();
		System.out.println("class a");
	}
	static void statictest(){
		System.out.println("class static method");
	}
	public void classmethodhidesinterfacedefaultmethodifsame() {
		// TODO Auto-generated method stub
		//Java8InterfaceTwo.super.show();
		//Java8InterfaceOne.super.show();
		System.out.println("classmethodhidesinterfacedefaultmethodifsame a");
	}
	
	
	public static void main(String args[]){
		
		MultipleInterfaceInClass mul=new MultipleInterfaceInClass();
		mul.show();
		mul.add();
		
	}

}
