package com.devlabs.lab8;

import java.util.Scanner;

public class StringAppend {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
				
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
		

	}

}
