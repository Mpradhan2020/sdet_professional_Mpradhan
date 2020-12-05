package com.devlabs.lab1;

public class RetailStoreOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int itemA=200, itemB=80, itemC=150;
		double total_amount;
		boolean memberCheck=false;
		
		total_amount= ((3*itemA) + (5*itemB) + (2*itemC));
		double discount= 0.15*total_amount;
		total_amount=total_amount-discount;
		total_amount=total_amount+(0.02*total_amount);
		//sysout ctrl+Space
		System.out.println("Total amount payble: "+ total_amount);
		
		if((total_amount>=1000) || (memberCheck==true)) // true
		{
			
			System.out.println("Congrats, U have a gift");
		}
		else
		{
			System.out.println("Thanks for Visiting Sotre");
			
		}

	}

}
