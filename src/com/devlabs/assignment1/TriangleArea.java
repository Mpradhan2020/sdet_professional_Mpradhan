package com.devlabs.assignment1;
import java.util.*;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner san= new Scanner(System.in);
        
        System.out.println("Enter width of Triangle:");
        double bradth= san.nextDouble();

        System.out.println("Enter height of Triangle:");
         double hight= san.nextDouble();

         san.close();
      //Area = (width*height)/2
     double area=(bradth*hight)/2;
     System.out.println("Area of Triangle is: " + area);  
	}

}
