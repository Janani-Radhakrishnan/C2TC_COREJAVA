package com.tnsif.daysix.staticvariable;

public class Employee {
	private String name;
	private int id;
	
	static String companyName = "TNS";

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Shubh", 123);
		System.out.println(e);
		
	
		e = new Employee("Deep", 321);
		System.out.println(e);
	}
	
	
}
