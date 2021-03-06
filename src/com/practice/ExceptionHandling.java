package com.practice;


public class ExceptionHandling {
	
	public static void main(String args[]){
		
		ExceptionHandling exp=new ExceptionHandling();
		exp.getDetails();
	}
	
	public void getDetails() {
		
		try {
			
			System.out.println("try");
			//only error not required to catch
			throw new Error("tes");
		}catch(RuntimeException ex){
			System.out.println("Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("finally");
		}
		
	}

}
