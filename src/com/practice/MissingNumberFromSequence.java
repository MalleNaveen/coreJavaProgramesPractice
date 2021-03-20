package com.practice;

public class MissingNumberFromSequence  implements Cloneable{
	
	public static void main(String arg[]) throws CloneNotSupportedException{
		
		MissingNumberFromSequence cl=new MissingNumberFromSequence();
		cl.clone();
		int[] arr={1,2,4,5,6};
		getMissingNumber(arr);
	}
	
	public static int getMissingNumber(int[] arr){
		int sum=0;
		for(int i=0; i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println(sum-(arr.length*(arr.length+1)/2));
		return 0;
	}

}
