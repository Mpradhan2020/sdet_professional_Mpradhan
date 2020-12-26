package com.devlabs.lab13;
import java.util.*;
//import java.util.HashSet;


public class SetAssgn1 {

	public static void main(String[] args) {
		HashSet<String> hSet =new HashSet<String>();
		
		hSet.add("Black");  
		hSet.add("Yellow");  
		hSet.add("Red");  
		hSet.add("Green");
		
		System.out.println("The color of Choice are: "+hSet);
		
		
 TreeSet<String> tSet = new TreeSet<String>(); 
		
		tSet.add("Truck");  
		tSet.add("Car");  
		tSet.add("Bike");  
		
		
		System.out.println("The color of Choice are: "+tSet);

	}

}
