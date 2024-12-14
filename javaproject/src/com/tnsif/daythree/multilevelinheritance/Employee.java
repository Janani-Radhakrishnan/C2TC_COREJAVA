package com.tnsif.daythree.multilevelinheritance;
import java.util.Date;

public class Employee extends Person {
	private String deptName;
	private double baseSalary;
	
	public Employee() {}

	public Employee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
		super(name, contactNo, dateOfBirth);
		this.deptName = deptName;
		this.baseSalary = baseSalary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Employee ["+super.toString()+", deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
	}
//	public static void main(String[] args) {
//
//		Person p1 = new Person("Atharv", 7878767676l, new Date(2000, 12, 2));
//		System.out.println(p1);
//
//		p1 = new Employee("Pranav", 8080807070l, new Date(1995, 05, 07), "Sales", 45000);
//		System.out.println(p1);
//
//		p1 = new LevelOneEmployee("Madhur", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
//				"Signing Authority");
//		System.out.println(p1);
//	}

	
}