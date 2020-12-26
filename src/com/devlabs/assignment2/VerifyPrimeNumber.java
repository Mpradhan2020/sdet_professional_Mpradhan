package com.devlabs.assignment2;

public class VerifyPrimeNumber {

	public static void main(String[] args) {
		int num = 13;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // Testing condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }

	}


