package com.devlabs.assignment2;

public class CalculateAverageArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int avg=0, sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
						
		}
		avg=sum/arr.length;
		
		System.out.println("Average is " + avg);

	}

}
