package com.threads;

class NewThread extends Thread { 
private static ThreadLocal gfg = new ThreadLocal(){ 
        protected Object initialValue(){ 
            return new Integer(question--); 
} 
} 
; 
  
private static int question = 15; 
NewThread(String name) 
{ 
    super(name); 
    start(); 
} 
  
public void run() 
{ 
    for (int i = 0; i < 2; i++) 
        System.out.println(getName() + " " + gfg.get()); 
} 
}


public class ThreadLocalDemo {

	public static void main(String[] args) {
		NewThread t1 = new NewThread("quiz1"); 
	    NewThread t2 = new NewThread("quiz2"); 
	    
        ThreadLocal<Number> gfg_local = new ThreadLocal<Number>(); 
  
        ThreadLocal<String> gfg = new ThreadLocal<String>(); 
        // setting the value 
        gfg_local.set(100); 
  
        // returns the current thread's value 
        System.out.println("value = " + gfg_local.get()); 
  
        // setting the value 
        gfg_local.set(90); 
  
        // returns the current thread's value of 
        System.out.println("value = " + gfg_local.get()); 
  
        // setting the value 
        gfg_local.set(88.45); 
  
        // returns the current thread's value of 
        System.out.println("value = " + gfg_local.get()); 
  
        // setting the value 
        gfg.set("GeeksforGeeks"); 
  
        // returns the current thread's value of 
        System.out.println("value = " + gfg.get()); 
        
          
        // removing vale 
        gfg_local.remove(); 
  
        // returns the current thread's value of 
        System.out.println("value = " + gfg_local.get()); 
        
	}

}
