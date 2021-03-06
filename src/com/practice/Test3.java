package com.practice;

 public  class Test3 extends AbstractClass{
	String a="10";
	StringBuilder strb=new StringBuilder("sbuilder");
	StringBuffer strbuff=new StringBuffer("sbuffer");
	public static void main(String args[]){
		Test3 test234=new Test3();
		test234.test();
		ImmutableClassTwo s = new ImmutableClassTwo("ABC", 101); 
        System.out.println(s.getName()); 
        System.out.println(s.getRegNo()); 
        Test3.getDetails();
        //Cannot instantiate the type AbstractClass
        AbstractClass abstractClass=new Test3();
        abstractClass.getDetailsAdd();
        // Uncommenting below line causes error 
        // s.regNo = 102; 
	}
	
	public void test(){
		a="30";
		System.out.println(a);
		System.out.println(strb);
		System.out.println(strbuff);
	}

	@Override
	void getDetailtest() {
		// TODO Auto-generated method stub
		
	}

}
