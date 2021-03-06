package com.practice;

import java.util.ArrayList;
import java.util.List;

public class SumSeqNum {
	public static void main(String args[]){
		List<Integer> seq=new ArrayList<Integer>();
		seq.add(6);
		seq.add(4);
		seq.add(2);
		seq.add(1);
		seq.add(5);
		SumSeqNum.getDetails(seq, 6);
		
	}
	
	public static void getDetails(List<Integer> seq,int targetsum){
		int count = 0;
		for (int i = 0; i < seq.size() - 1; i++) {

			// Counting occurrences of s[i]
		if(seq.get(i)==targetsum ){
			count++;
		}/*else if((seq.get(seq.size()-1)==targetsum)){
			count++;*/
		else{
			while(seq.get(i) + seq.get(i + 1)==targetsum){
				i++;
			count++;
				if (i + 1 == seq.size())
					break;
			}
		}
		
		}
		System.out.println(count);
	}

}
