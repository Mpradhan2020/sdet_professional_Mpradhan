package com.devlabs.assignment2;

public class FindOdd {

	public static void main(String[] args) {
		
		// find odd between 79 and 187
		int firstNum=79, lastNum=187;
		
		System.out.println("Odd numbers are: ");
		for(int i = firstNum; i <=lastNum; i++){
			if( i % 2 != 0 ){
			System.out.print(i + " ");
			}
		}
	}
}
