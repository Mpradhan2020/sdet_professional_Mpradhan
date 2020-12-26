package com.devlabs.assignment4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapToListEx {
//	Convert keys of a map to a list.
	public static void main(String[] args) {
		// Create an empty hash map 
        HashMap<String, Integer> mapList = new HashMap<>(); 
  
        // Add elements to the map 
        mapList.put("Yellow", 10); 
        mapList.put("Black", 30); 
        mapList.put("Green", 20); 
  
        // Find Set of keys from HashMap 
        Set<String> keySet = mapList.keySet(); 
  
        // Creating an ArrayList of keys by passing the keySet 
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet); 
  
        // Getting Collection of values from HashMap 
        Collection<Integer> values = mapList.values(); 
  
        // Creating an ArrayList of values 
        ArrayList<Integer> listOfValues = new ArrayList<>(values); 
  
        System.out.println("Keys of the Map are " + listOfKeys); 
        System.out.println("Values of the Map are " + listOfValues); 

	}

}
