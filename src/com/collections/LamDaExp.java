package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.practice.FunctionalInterFace;

public class LamDaExp implements FunctionalInterFace{

	public static void main(String[] args) {
	
		List<String> arr=new ArrayList<String>();
		arr.add("test");
		arr.add("naveen");
		arr.add("test2");
		LamDaExp lamDaExp=new LamDaExp();
		lamDaExp.practiceLamdaExp(arr);
	}
	
	public void practiceLamdaExp(List<String> arr){
		
		Map<String,String> map=new HashMap<String,String>(); 
		map.put("test", "test2");
		map.put("test3", "test4");
		map.forEach((str,str1)->System.out.println(str+str1));
		arr.forEach((str)->System.out.println(str));
		
	}

	public void practiceLamdaExp2(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	


}
