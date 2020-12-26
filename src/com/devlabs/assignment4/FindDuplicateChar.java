package com.devlabs.assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChar {
//Find duplicate characters with their occurrences count using HashMap
	 public void findChar(String str) {  
	        Map<Character, Integer> bMap = new HashMap<Character, Integer>();  
	        char[] charArr = str.toCharArray();  
	        for (Character ch : charArr) {  
	            if (bMap.containsKey(ch)) {  
	                bMap.put(ch, bMap.get(ch) + 1);  
	            } else {  
	                bMap.put(ch, 1);  
	            }  
	        }  
	        Set<Character> keys = bMap.keySet();  
	        for (Character ch : keys) {  
	            if (bMap.get(ch) > 1) {  
	                System.out.println(ch + " :: " + bMap.get(ch) + " times");  
	            }  
	        }  
	 }
	 
	 public static void main(String a[]) {  
		 FindDuplicateChar dcf = new FindDuplicateChar();  
	        dcf.findChar("Welcome to the Hello World");  
	    }  
}
