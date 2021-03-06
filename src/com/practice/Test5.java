package com.practice;

public class Test5 {

	public static void main(String args[]){
		getEmpDetails();
	}
	
	public  void getDetails(){
		try{
			getFetch();
			return;
		}catch(Exception e){
			System.out.println("exception");
		}
	}
	
	private void getFetch(){
		try{
			
			return;
		}catch(Exception e){
			System.out.println("exception");
		}
		
	}
	
	public static  void getEmpDetails(){
		try{
			System.out.println("getEmpDetails");
			return;
		
		}
		catch(Exception e){
			System.out.println("exception");
		}
		catch(Error e1){
			System.out.println("exception");
		}
		finally{
			System.out.println("finally");
		}
	}
	
	
}
