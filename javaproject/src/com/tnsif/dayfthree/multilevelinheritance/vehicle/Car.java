package com.tnsif.dayfthree.multilevelinheritance.vehicle;

public class Car {
	public Car() {
		System.out.println("Class Car");
	}
	public void vehicleType() {
		System.out.println("Vehicle Type: Car");
	}
	
	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.vehicleType();
		
		Maruti m=new Maruti();
		m.vehicleType();
		m.brand();
		m.speed();
		
		Maruti800 m1=new Maruti800();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
		
	}
}
