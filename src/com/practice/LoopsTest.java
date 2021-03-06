package com.practice;

public class LoopsTest {
	public static void main(String args[]){
		LoopsTest loopsTest=new LoopsTest();
		loopsTest.testWhile(4);
		loopsTest.testFor();
		//loopsTest.testInfinet();
	}
	
	public void testWhile(int i){
		while(i>3){
			System.out.println("while");
			i--;
		}
		
		
		
	}
public void testFor(){
	for(int i=0;i<10;i++){
		System.out.println("for loop"+i);
	}
	int arr[]={1,2,3};
	for(int a:arr){
		System.out.println("for each"+a);
	}
		
	}
public void testInfinet(){
	int i=2;
	while(i>1){
		System.out.println("infinite for while");
	}
	for(int j=0;j<Integer.MAX_VALUE;i++){
		System.out.println("infinite for loop");
	}
	
}

}
