package com.tnsif.dayeight.interfaces.markerinterfaces;

public class Student implements Registrable {
	private int id;
	private String name;
	private double fees;
	private String course;
	
	Student(){
		super();
	}
	
	public Student(int id, String name, double fees, String course) {
		super();
		this.id = id;
		this.name= name;
		this.fees = fees;
		this.course = course;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the fees
	 */
	public double getFees() {
		return fees;
	}

	/**
	 * @param fees the fees to set
	 */
	public void setFees(double fees) {
		this.fees = fees;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", course=" + course + "]";
	}
	
	public static void main(String[] args) {
		Student s=new Student(101,"Neha",12000,"C++");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}
}


