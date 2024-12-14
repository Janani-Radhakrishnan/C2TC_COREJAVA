package com.tnsif.daythree.multilevelinheritance;
//import java.text.SimpleDateFormat;
import java.util.Date;
public class Person {
	private String name;
	private long contactNo;
	private Date dateOfBirth;
	public Person(String name, long contactNo, Date dateOfBirth) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.dateOfBirth = dateOfBirth;
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
	 * @return the contactNo
	 */
	public long getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Person()
	{
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", contactNo=" + contactNo + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	public static void main(String[] args) {

		Person p1 = new Person("Atharv", 7878767676l, new Date(2000, 12, 2));
		System.out.println(p1);

		p1 = new Employee("Pranav", 8080807070l, new Date(1995, 05, 07), "Sales", 45000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Madhur", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
				"Signing Authority");
		System.out.println(p1);
	}

	
	
}
