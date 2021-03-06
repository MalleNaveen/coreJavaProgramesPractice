package com.practice;

import java.util.Map;

public class NumberRightShift {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int rightShift=4;
		
		System.out.println(getRightShifted(arr,rightShift));

	}
	
	public static int[] getRightShifted(int[] arr,int rightShift) {
		int[] out= new int[arr.length] ;
		int[] shifted= new int[rightShift];
		int j=0;
		for(int i=0;i<arr.length;i++) {			
			if(i<rightShift) {
				shifted[i]=arr[i];				
			}else {				 
				out[j]=arr[i];
				j++;				
			}
					
		}
		
		for(int k=0;k<shifted.length;k++) {			
			out[j]=shifted[k];
			j++;
		}
				
		return out;
	}
	
	public static void  dispCap(Map<String,String> map) {
		
	}

}
