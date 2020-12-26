package com.devlabs.lab7;

public class StringCondinate {

	public static void main(String[] args) {
		
		String str1 ="Hello ";
		String str2 ="Java";
		
		String str=str1.concat(str2);
				
		System.out.println("Concadinate string is : " +str);
		
		StringBuilder bb = new StringBuilder(str1);
		System.out.println("StringBuilder is : " +bb);
		
		bb.append(str2);
		System.out.println("StringBuilder append is : " +bb);
		
		
		StringBuffer strbf = new StringBuffer(str1);
		
		System.out.println("StringBuffer is : " +strbf);
		
		strbf.append(str2);
		System.out.println("StringBuffer append is : " +strbf);
		
//		 Trim method
		System.out.println("Trim method witespace removed from RHS " + str1.trim() +"OK");
		
		
	String ss= "Pan Pun Prank Pit Pat";
	
	String ss1=ss.replace('P', 'F');
	
	System.out.println("Without Replaced character P to F : " +ss);
	System.out.println("Replaced character P to F : " +ss1);
	
	}

}
