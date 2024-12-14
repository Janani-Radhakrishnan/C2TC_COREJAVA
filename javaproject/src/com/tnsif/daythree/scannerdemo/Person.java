package com.tnsif.daythree.scannerdemo;
import java.util.Scanner;
public class Person {
	private String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
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
	 * @return the income
	 */
	public int getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(int income) {
		this.income = income;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the tax
	 */
	public int getTax() {
		return tax;
	}
	/**
	 * @param tax the tax to set
	 */
	public void setTax(int tax) {
		this.tax = tax;
	}
	//@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}
	
	public void calculateTax(Person person) {
		if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
		person.setTax(0);
		System.out.println("Tax not applicable");
		} else {
		if (person.getIncome() <= 160000) {
		person.setTax(0);
		} else if (person.getIncome() > 160000 && person.getIncome() <= 500000) {
		person.setTax((person.getIncome() - 160000) * 10 / 100);
		} else if (person.getIncome() >= 500000 && person.getIncome() <= 800000) {
		person.setTax((person.getIncome() - 500000) * 20 / 100 + 34000);
		} else {
		person.setTax((person.getIncome() - 800000) * 30 / 100 + 94000);
		}
		}
}
	public static void main(String[] args) {
		//scanner object to accept user inputs
		Scanner ob = new Scanner(System.in);
		String name;
		System.out.println("Enter Person Name : ");
		name = ob.next();
		System.out.println("Enter age: ");
		int age = ob.nextInt();
		System.out.println("Enter gender: ");
		String gender = ob.next();
		System.out.println("Enter taxable income: ");
		int income = ob.nextInt();
		//Person object and initialize values using setter
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		//display person details using toString() method
		System.out.println(person);
		Person calc = new Person();
		calc.calculateTax(person); //tax calculation
		System.out.println("After calculating tax : ");
		System.out.println(person);
		ob.close();
		}
}
