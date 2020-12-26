package com.devlabs.lab13;

import java.util.HashSet;

public class ItemHSet {

	public static void main(String[] args) {
HashSet<String> hSet =new HashSet<String>();
		
		hSet.add("Black");  
		hSet.add("Yellow");  
		hSet.add("Red");  
		hSet.add("Green");
		
		System.out.println("Size of HasSet : "+hSet.size() );

		System.out.println("Is Item Green available : "+hSet.contains("Green"));

	}

}
