package com.practice;

public class StringAndIntPalindromeChk {
	
	
	static  boolean isPalindrome(String str)
    { 	        
        int i = 0, j = str.length() - 1;
         while (i < j) {	 
           
            if (str.charAt(i) != str.charAt(j))
                return false; 	           
            i++;
            j--;
        }	 

        return true;
    }
 
    public static void main(String[] args)
    {
    	
    

        String str = "nan";
 
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    
    
        int r,sum=0,temp;    
        int n=454;//It is the number variable to be checked for palindrome  
        
        temp=n;    
        while(n>0){    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum)    
         System.out.println("palindrome number ");    
        else    
         System.out.println("not palindrome"); 
    }
    
    
}
