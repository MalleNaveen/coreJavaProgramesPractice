package com.practice;

public class ExceptionInFinallyBlock {

	
	public static void main(String args[]) {
		//ExceptionInFinallyBlock.checkFinally();
	}

	
	public static int checkFinally()  {
		try
        {
			System.out.println("try");
        }catch (Exception e){
        	//e.printStackTrace();
        }
       //if finally block as exception then it will throw same like normal code.
        finally
        {
        	try{
        	 System.out.println("Inner finally block");
            throw new Exception("exception thrown from finally block");
        	}catch(Exception e){
        		System.out.println("ex="+e);
        	}
        }
		return 0;
	}
	static
	{
		try{
			int b=1/0;
			System.out.println("try b");
			
		}catch(ArithmeticException e){
			System.out.println("arithmatic exception");
		}finally{
			System.out.println("before finally exception");
		try{
			int c=1/0;
		}catch(ArithmeticException e){
			System.out.println("exception");
		}
			System.out.println(" exception handled in finally block");
		}
		
	}
}
