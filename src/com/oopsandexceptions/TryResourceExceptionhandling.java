package com.oopsandexceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class TryResourceExceptionhandling {
	public static void main(String args[]) throws IOException{
		printFile();
		exceptionBlockTest();
	}
	
	private static void printFile() throws IOException {
		
		

	    try(FileInputStream input = new FileInputStream("file.txt")) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}
	
	public static void exceptionBlockTest(){
		try{
			System.out.println("tes");
			 throw new Exception("tst");
		}catch(Exception e){
			
		}
	}
	//java 9
	/*private static void printFile1() throws IOException {
	    FileInputStream in = new FileInputStream("file.txt");
	    try(in) {

	        int data = in.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input1.read();
	        }
	    }*/
	}

