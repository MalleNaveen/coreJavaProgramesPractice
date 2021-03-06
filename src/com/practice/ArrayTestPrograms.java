package com.practice;

public class ArrayTestPrograms {
	
	public static void main(String args[]){
		ArrayTestPrograms arrTest=new ArrayTestPrograms();
		int arr[]={1,3,5,7,4,0};
		arrTest.testTwoValuesSome(arr,4);
	}
	
	public void testTwoValuesSome(int[] arry,int sum){
		
		int count=0;
		for(int i=0;i<arry.length;i++){
			
			for(int j=0;j<arry.length;j++){
				if(arry[i]+arry[j]==sum){
					System.out.printf("(%d, %d) %n", arry[i], arry[j]);
					count++;
				}
				
			}
			
		}
		System.out.println("sum count="+ count);
		
	}

}
