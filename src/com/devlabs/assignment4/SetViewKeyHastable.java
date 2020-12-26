package com.devlabs.assignment4;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class SetViewKeyHastable {
//Get Set view of keys from HashTable
	public static void main(String[] args) {
		 Hashtable<String,String> hstab = new Hashtable<String,String>();

		 hstab.put("0", "Zero");
		 hstab.put("1", "One");
		 hstab.put("2", "Two");
		 hstab.put("3", "Three");
		 hstab.put("4", "Four");

		    Set st = hstab.keySet();

		    Iterator itr = st.iterator();

		    System.out.println("HasTable items are: ");
		    while (itr.hasNext()){
		      System.out.println(itr.next());
		    }
		    System.out.println("Removing one item 3 !!!");
		    st.remove("3");

		    Enumeration e = hstab.keys();
		    System.out.println("Now HasTable items are: ");
		    while (e.hasMoreElements()){
		      System.out.println(e.nextElement());      
		    }

	}

}
