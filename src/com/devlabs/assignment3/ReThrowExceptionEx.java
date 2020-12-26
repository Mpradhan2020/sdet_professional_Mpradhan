package com.devlabs.assignment3;

public class ReThrowExceptionEx {
//Write a program to re-throw an exception. (throw inside catch block)
	 static void getStringLength(){
	        
		// try and catch exception 
		 try{
	            String text = null;
	            int length = text.length();
	        }catch(Exception e){
	            System.out.println("Caught exception : "+e.toString());
	            throw e;
	        }
	    }
	
	public static void main(String[] args) {
		// try and catch rethough exception
		try{
	            getStringLength();
	        }catch(Exception e){
	            System.out.println("Caught re-thrown exception : "+e.toString());
	        }
	    }

	}


