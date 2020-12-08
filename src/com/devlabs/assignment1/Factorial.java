package com.devlabs.assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int num = scan.nextInt();
        scan.close();
        
        int i=1, factorial=1;
        
        if (num%2==0)
        {
        	while(i<=num)
        	{
        		factorial=factorial*i;
        		i++;
        	}
        	
        	System.out.println("Factroial of input number is " + factorial);        	
	}
	else {
        	
		System.out.println("You enter a Even number!!!");
	}
		
	}

}
