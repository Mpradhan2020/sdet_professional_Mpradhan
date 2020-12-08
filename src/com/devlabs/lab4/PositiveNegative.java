package com.devlabs.lab4;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
	        System.out.println("Enter the Number : ");
	        
	        int num = reader.nextInt();
	        
	        reader.close();
	        
	        if (num>0)
	        {
	        	System.out.println("Number is +ve");
	        }
	        else if (num<0)
	        {
	        	System.out.println("Number is -ve");
	        }
	        else
	        {
	        	System.out.println("Number is ZERO");
	        	
	        }
	        
	        
	}

}
