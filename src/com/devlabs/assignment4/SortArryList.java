package com.devlabs.assignment4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortArryList {
//Sort ArrayList of Strings alphabetically.
	public static void main(String[] args) {
		//Unsorted list
		List<String> colors = Arrays.asList("Red", "Yellow", "Green", "Brown");
		 
		//1. Natural order
		Collections.sort(colors);
		System.out.println("Ascending Order list: " +colors);
		
		//2. Reverse order
		Collections.sort(colors, Collections.reverseOrder());
		System.out.println("Ascending Order list: " +colors);

	}

}
