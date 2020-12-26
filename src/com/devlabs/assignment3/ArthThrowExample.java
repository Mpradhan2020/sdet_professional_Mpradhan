package com.devlabs.assignment3;



public class ArthThrowExample {
//Write a program where a method declares that it throws ArithmeticException.
	static void Eligibilty(int age, int weight){ 
	      if(age<12 && weight<40) {
	         throw new ArithmeticException("Student: not eligible for registration"); 
	      }
	      else {
	         System.out.println("Student Entry allowed"); 
	      }
	   } 
	
	public static void main(String[] args) {
		 System.out.println("Welcome to the Registration, Good Luck ");
	     Eligibilty(10, 39); 
	     System.out.println("Have a nice day"); 
	 } 

	}


