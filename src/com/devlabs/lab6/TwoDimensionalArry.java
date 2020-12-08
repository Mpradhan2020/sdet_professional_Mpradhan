package com.devlabs.lab6;
import java.util.*;
public class TwoDimensionalArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char twoDim [][] = {{'a','e','i','o','u'}, 
							{'1','2','3','4','5'}
							}; 
		
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<5;j++)	
			{
				System.out.print(" "+twoDim[i][j] );
				
			}
			System.out.println("");
		}
		
	}

}
