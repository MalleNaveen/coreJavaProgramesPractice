package com.practice;


public class SortNumbers {
	
	
	public static void main(String args[]){
		int[] arry={4,7,2,5,1};
		int temp=0;
		for(int i=0;i<arry.length;i++){
			
			for(int j=0;j<arry.length;j++){
				if(arry[i]>arry[j]){
			
					temp = arry[i];  
					arry[i] = arry[j];  
					arry[j] = temp;  
					
					
				}
			}
		}
		for(int i=0;i<arry.length;i++){
		System.out.println(arry[i]);
		}
	}
	
	public void add(){
		
	}

}
