package com.devlabs.assignment1;

public class TwoDimArray {

	public static void main(String[] args) {
		char twoDim [][] = {{'0',}, 
							{'0','0'}, 
							{'0','0','0'},
							{'0','0','0','0'},
							{'0','0','0','0','0'},
							{'0','0','0','0','0','0'},
							{'0','0','0','0','0','0','0'},
							{'0','0','0','0','0','0','0','0'},
							{'0','0','0','0','0','0','0','0','0'},
							{'0','0','0','0','0','0','0','0','0','0'}
				}; 


for (int i=0;i<10;i++)
{
	for (int j=0;j<=i;j++)	
		{
			System.out.print(twoDim[i][j]);
			
		}
	System.out.println("");
}

	}

}
