package com.practice;


public class ArrayReverse {

	public static void main(String[] args) {
  int[] a={1,2,3,4};
  
  rvereseArray(a,0,a.length-1);
  printArray(a,a.length);
	}
	 /* Function to reverse arr[] from start to end*/
    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 
        if (start >= end) 
            return; 
        temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp; 
        rvereseArray(arr, start+1, end-1); 
    } 
    /* Utility that prints out an array on a line */
    static void printArray(int arr[], int size) 
    { 
        for (int i=0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
}
