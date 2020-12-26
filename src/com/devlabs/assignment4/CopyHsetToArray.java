package com.devlabs.assignment4;

import java.util.HashSet;
import java.util.Set;

public class CopyHsetToArray {
//Copy all elements of a HashSet to an Object array
	public static void main(String[] args) {
		 Set<Integer> hSet = new HashSet<Integer>();
	      hSet.add(11);
	      hSet.add(21);
	      hSet.add(41);
	      hSet.add(60);
	      hSet.add(34);
	      hSet.add(86);
	      hSet.add(987);
	      hSet.add(1275);
	      System.out.println("Elements in HasSet are: "+hSet);
	      System.out.println("Copy all elements to Array");
	      Object[] obArry = hSet.toArray();
	      for (Object obj : obArry)
	      System.out.println(obj);

	}

}
