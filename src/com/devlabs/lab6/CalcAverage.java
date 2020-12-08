package com.devlabs.lab6;
import java.util.*;
public class CalcAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,56,34,2,7};
		int avg=0, sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
						
		}
		avg=sum/arr.length;
		
		System.out.println("Average is " + avg);
	}

}
