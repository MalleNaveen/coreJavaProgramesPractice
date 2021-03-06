package com.practice;

public class OverriddenSubClass extends OverridenSuperClass{

	
	// This method hides display() in Base  
    public static void display() { 
         System.out.println("Static or class method from Derived"); 
    } 
      
    // This method overrides print() in Base  
    public void print() { 
         System.out.println("Non-static or Instance method from Derived"); 
   } 
    
    public static void main(String args[ ])  { 
    	OverridenSuperClass obj1 = new OverriddenSubClass(); 
          
        // As per overriding rules this should call to class Derive's static  
        // overridden method. Since static method can not be overridden, it  
        // calls Base's display()  
        obj1.display();   
          
        // Here overriding works and Derive's print() is called  
        obj1.print();      
     } 
}
