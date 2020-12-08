package com.devlabs.assignment1;

public class Sum20NaturalNum {

	public static void main(String[] args) {
		 
		int num = 20, count, total = 0;

	       for(count = 1; count <= num; count++){
	           total = total + count;
	       }

	       System.out.println("Sum of first 20 natural numbers is: "+total);

	}

}
