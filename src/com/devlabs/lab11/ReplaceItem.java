package com.devlabs.lab11;

import java.util.ArrayList;
import java.util.List;

public class ReplaceItem {

	public static void main(String[] args) {
		List item = new ArrayList();
		
		item.add("Amit");
		item.add("Suvendu");
		item.add("Sruti");
		
		 for(int j=0;j<item.size();j++)
	       {  
	         System.out.println("Item at index : "+ j + " is " + item.get(j)); 
	       }  
		
		 System.out.println("-------------------------------");
		 item.remove(1);
		 item.add(1, "James");
		 System.out.println("Added item is : "+ item.get(1) );
		 System.out.println("-------------------------------");
		 for(int j=0;j<item.size();j++)
	       {  
	         System.out.println("Item at index : "+ j + " is " + item.get(j)); 
	       }  

	}

}
