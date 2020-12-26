package com.devlabs.assignment4;

import java.util.HashMap;

public class IsHasMapExist {
//Check if a particular key exists in HashMap.
	public static void main(String[] args) {
		
		// Creating an empty HashMap 
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        hash_map.put(10, "Brown"); 
        hash_map.put(15, "1234"); 
        hash_map.put(20, "Yellow"); 
        hash_map.put(25, "Dark"); 
        hash_map.put(30, "White"); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_map); 
  
        // Checking for the key_element '25' 
        System.out.println("Is the key '25' present? " +  
        hash_map.containsKey(25)); 
  
        // Checking for the key_element '3' 
        System.out.println("Is the key '3' present? " +  
        hash_map.containsKey(3)); 
        
        
       // Checking for the value 'Yellow' 
        System.out.println("Is the key 'Yellow' present? " +  
        hash_map.containsValue("Yellow")); 
  
        // Checking for the value 'Hello' 
        System.out.println("Is the key 'Hello' present? " +  
        hash_map.containsValue("Hello")); 
        
	}

}
