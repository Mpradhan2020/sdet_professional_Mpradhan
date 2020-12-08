package com.devlabs.lab5;

import java.util.Scanner;

public class PrimeNumberBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Please input first number: ");
	        int first = scan.nextInt();
	        System.out.println("Please input first number: ");
	        int second = scan.nextInt();
	        scan.close();

	        int lowest, highest;
if (first>second) {
	lowest=second;
	highest=first;
	
}	  
else
{
	lowest=first;
	highest=second;
	}
	        

while (highest>lowest)
{
if (lowest%2!=0)
{
	System.out.println("Prime number is " + lowest);
		
	}
lowest++;

}

	}

}
