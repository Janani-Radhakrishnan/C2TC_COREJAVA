package com.tnsif.dayfive.singleinheritance;

public class Citizen {
	private String name;
	private String aadharNo;
	private String address;
	private long phno;
	public Citizen() {
		System.out.println("Citizen object created");
	}
	public Citizen(String name, String aadharNo, String address, long phno) {

		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phno = phno;
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
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}
	/**
	 * @param aadharNo the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phno
	 */
	public long getPhno() {
		return phno;
	}
	/**
	 * @param phno the phno to set
	 */
	public void setPhno(long phno) {
		this.phno = phno;
	}
	//@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phno=" + phno + "]";
	}
	public static void main(String[] args) {
		
		Student student = new Student("Gayatri", "8080808080", "Bangalore", 9888878787L, 10, "City College");
		System.out.println(student);
	}
	
}
