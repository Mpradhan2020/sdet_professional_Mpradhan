package com.devlabs.assignment4;

import java.util.TreeSet;

public class TreeSetHighestLowestEx {
//Get highest and lowest value stored in TreeSet
	public static void main(String[] args) {
		TreeSet<Integer> treeSet  = new TreeSet<Integer>(); 

    // Elements are added using add() method 
		treeSet.add(124); 
		treeSet.add(985); 
		treeSet.add(3); 

    System.out.println("Tree Set is " + treeSet); 

    int check = 3; 

    // Check if the above string exists in the treeset or not 
    System.out.println("Contains " + check + " " + treeSet.contains(check)); 

    // Print the first element in the TreeSet 
    System.out.println("First Value " + treeSet.first()); 

    // Print the last element in the TreeSet 
    System.out.println("Last Value " + treeSet.last()); 

    int val = 124; 

    // Find the values just greater and smaller than the above value 
    System.out.println("Higher " + treeSet.higher(val)); 
    System.out.println("Lower " + treeSet.lower(val)); 

	}

}
