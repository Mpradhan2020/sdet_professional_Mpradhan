package com.devlabs.lab1;

public class Car {
	
	static int tyres=4; // instance variable -- for every instance, there will be a copy of instance variables
	int price;
	int speed; 

	public static void main(String[] args) {
	
		Car c= new Car();
		c.display("Audi");
		c.price=500000;
		c.speed=8;
		System.out.println("Prince of Audi is : "+ c.price);
		
		Car c1= new Car();
		c1.display("Audi");
		c1.price=1000000;
		c1.speed=8;
		System.out.println("Prince of Audi is : "+ c1.price);
	}
	
	public void display(String m) {
		
		//String model=m; // local vairable
		System.out.println("The model is :" + m);
		System.out.println("Care tyre only: "+ Car.tyres);
		
	}

}
