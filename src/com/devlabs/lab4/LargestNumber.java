package com.devlabs.lab4;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the fist Number");
        
        int a = reader.nextInt();
        
        System.out.println("Enter the Second Number");
        int b = reader.nextInt();
        
        System.out.println("Enter the Third Number");
        int c = reader.nextInt();
        
        reader.close();
        
		
		
		if (a>b && a>c)
		{
			System.out.println("Largest number : "+a);
		}
		else if (b>a && b>c) {
			System.out.println("Largest number : "+b);
		}
		else
		{
			System.out.println("Largest number : "+c);
		}
			
		
	}

}
