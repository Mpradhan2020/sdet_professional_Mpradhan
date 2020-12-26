package com.devlabs.assignment3;

public class ExNumberFormatException {

	private static final String inputStr = "104.56";  
	
	public static void main(String[] args) {
		 try {  
             int a = Integer.parseInt(inputStr);  
    }catch(NumberFormatException ex){  
        System.err.println("Invalid string argumment");  
        //request for well-formatted string  
    }  

	}

}
