package com.devlabs.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListEx {
//Reverse an Arraylist
	public static void main(String[] args) {
		 //Constructing an ArrayList
        
        ArrayList<String> colorList = new ArrayList<String>();
                 
        colorList.add("Yellow");
         
        colorList.add("Blue");
         
        colorList.add("Red");
         
        colorList.add("Golden");
         
        colorList.add("Brown");
         
        colorList.add("White");
         
        colorList.add("Black");
         
        //colorList list before reverse
         
        System.out.println("ArrayList Before Reverse :");
         
        System.out.println(colorList);
         
        //Reversing the color list using Collections.reverse() method
         
        Collections.reverse(colorList);
         
        //Printing list after reverse
         
        System.out.println("ArrayList After Reverse :");
         
        System.out.println(colorList);
	}

}
