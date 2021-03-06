package com.practice;

public class Test22 {
	 static int tmp=10;
	 int i=1;
	public static void main(String[] args) {
		Test22 test=new Test22();
		int[] arr={5,4,6,2};
		//test.printArray(arr);
		test.recursion(tmp);
	}
	
	public  void printArray(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++){
		
		for(int j=i;j<arr.length;j++){
			
			if(arr[i]>arr[j]){
				count++;
			}
			
		}
		System.out.println(arr[i] +"="+count);
		count=0;
	}
		
	}
	
	public  void recursion(int num){
		
		if(num >=0){
			if((tmp-num)!=0){
			System.out.println(tmp-num);
			}
			recursion(num-1);
		}
	  
				
				
		
	}
	

}
