package com.devlabs.assignment3;

public class StringArray {

	public static void main(String[] args) {
		char[] chr = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
	      String str1 = new String(chr);
	      System.out.println(str1);
	 
	      // Using valueOf method
	      String str2 = String.valueOf(chr);
	      System.out.println(str2);

	}

}
