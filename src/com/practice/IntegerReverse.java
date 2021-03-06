package com.practice;

public class IntegerReverse {

	public static void main(String[] args) {
		IntegerReverse intRev=new IntegerReverse();
		int revInt=intRev.getReverseInt(123);
		System.out.println(revInt);
	}
	public int getReverseInt(int value) {
		
	   /* int resultNumber = 0;
	    for (int i = value; i !=0; i /= 10) {
	        resultNumber = resultNumber * 10 + i % 10;
	    }
	    return resultNumber;  */  
		int rev = 0;
		while (value != 0) {
		    rev = rev * 10 + value % 10;
		    value /= 10;
		}
		return rev;
	}
}
