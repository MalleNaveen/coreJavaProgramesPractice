package com.practice;

public class SecondHighestFromArray {

	public static void main(String[] args) {

		SecondHighestFromArray arr=new SecondHighestFromArray();
		int[] inputArr={2,4,5,10,78,90};
	int res=arr.getSecondHighest(inputArr);
	
	System.out.println(res);
	}
	
	public int getSecondHighest(int arr[]){
		int firstHighest=arr[0];
		int secondeHighest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>firstHighest){
				secondeHighest=firstHighest;
				firstHighest=arr[i];
				
			}
			if(arr[i]>secondeHighest && arr[i]!=firstHighest){
				secondeHighest=arr[i];
			}
		}
		
		return secondeHighest;
	}

}
