package com.practice;

public class SwapNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:"
                           + " x = " + x + ", y = " + y);
        
        //second
        
        int x1 = 10;
        int y1 = 5;
 
        // Code to swap 'x' and 'y'
        x1 = x1 * y1; // x now becomes 50
        y1 = x1 / y1; // y becomes 10
        x1 = x1 / y1; // x becomes 5
 
        System.out.println("After swaping:"
                           + " x = " + x1 + ", y = " + y1);
	}

}
