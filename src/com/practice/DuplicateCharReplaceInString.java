package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharReplaceInString {
	public static void main(String[] args) {
		
		
		replaceDupliChar();
		    }
	
	
	public static void replaceDupliChar(){
		String str="malle";
		Set<Character> ch1=new HashSet<>();
		StringBuilder sb=new StringBuilder(str);
		for(Character test : str.toCharArray()){
			ch1.add(test);
		}
		for(Character duid : ch1){
			int count=0;
			for(int j=0;j<str.length();j++){
				
				if(duid==str.charAt(j)){
					count++;
				}
				
				if(count>1){
					count--;
					sb.setCharAt(j,'X');
					
				}
			}
			
		
		
		}
		System.out.println("replaced String="+sb);
		//replace all duplicate char

        String naveenstr = "naveen";
        Map<Character, Integer> items = new HashMap<Character, Integer>();
        for (int i = 0; i < naveenstr.length(); i++) {
            char c = naveenstr.charAt(i);
            if (items.containsKey(c)) {
                int cnt = items.get(c);
                items.put(c, ++cnt);
            } else {
                items.put(c, 1);
            }
        }

        Set<Character> keys = items.keySet();
        for (Character ch : keys) {
            if (items.get(ch) > 1) {
            	naveenstr = naveenstr.replaceAll(ch.toString(), "*");
            }
        }

        System.out.println("replace all duplicate char : " + naveenstr);

	}
}
