package com.devlabs.assignment1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// input year 
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Please input the no:");
	    int year = scan.nextInt();
		scan.close();
	    
	    boolean leap = false;

	    //year is divided by 4
	    if (year % 4 == 0) {

	      //year is century
	      if (year % 100 == 0) {

	        // year is divided by 400
	        // it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // year is not century
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap)
	      System.out.println(year + " a leap year.");
	    else
	      System.out.println(year + " not a leap year.");
	

	}

}
