package com.practice;


public class Test8 {

	public static void main(String args[]){
		
		//assertEquals("1,2,2", occurenceOfCharacter.getOccuranceOfCharacter("1 FOR 1 2 For 2"));
		//assertEquals("2,2,2,5,5,10", occurenceOfCharacter.getOccuranceOfCharacter("2 FOR 3 5 For 2 10"));
		//assertEquals("2,2,2,1,5,5,10", occurenceOfCharacter.getOccuranceOfCharacter("2 FOR 3 1 5 For 2 9 For 0 10"));
		
		String str="2 FOR 3 1 5 For 2 9 For 0 10";
		String tmp="";
		String[] output=str.split(" ");
		for(int i=0;i<output.length;i++){	
			
			while(output[i].equalsIgnoreCase("FOR")){				
				if((i+1)> output.length){
					break;
				}
				for(int j=0;j<Integer.parseInt(output[i+1]);j++){
					tmp+=output[i-1]+",";						
				}
				i++;
			}
			
	
		}
		System.out.println(tmp.substring(0, tmp.length() - 1));
	}
}
