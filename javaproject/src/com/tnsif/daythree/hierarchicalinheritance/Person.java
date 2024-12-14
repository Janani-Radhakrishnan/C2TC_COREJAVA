package com.tnsif.daythree.hierarchicalinheritance;

public class Person {
	private String name;
	private String city;
	public Person() {
		System.out.println("Person class default constructor");
		name="Amit";
		city="Pune";
	}
	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	//@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	
}
