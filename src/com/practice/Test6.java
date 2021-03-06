package com.practice;

public class Test6  {
	
	public static void getTest(){
		
		try{
			throw new Error();
			//No exception of type int can be thrown; an exception type must be a subclass of Throwable
			//throw 10;
		}
		//No exception of type int can be thrown; an exception type must be a subclass of Throwable
		/*catch(int e){
			
		}*/
		catch(Exception e){
			
		}
		//it should be order
     /*catch(ArithmeticException e1){
			
		}*/
		//only VM filure and system.exit(0) it won't call
		finally{
			System.out.println("testtt");
		}
	}
		public static void main(String args[]){
	
			getTest();
		}
	}

