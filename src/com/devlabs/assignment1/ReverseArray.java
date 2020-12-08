package com.devlabs.assignment1;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
				
		 	Scanner scan = new Scanner(System.in);
	        System.out.println("Please input size of array: ");
	        int arraySize = scan.nextInt();
	        
	        int array[]= new int [arraySize];
	        
	        for(int i=0; i<arraySize; i++) {
	        	
	        	System.out.println("Enter element of array at INDEX: " + i + " as : ");
	        	array[i]=scan.nextInt();
	        	
	        }
	        scan.close();
	        
	        for (int i = 0; i < array.length; i++) {  
	            System.out.print(array[i] + " ");  
	        }  
	        
	        
	        System.out.println("Array in reverse order is: ");  
	        //Loop through the array in reverse order  
	        for (int i = array.length-1; i >= 0; i--) {  
	            System.out.print(array[i] + " ");  
	        }  
	        
	        

	        
	        
	}

}
