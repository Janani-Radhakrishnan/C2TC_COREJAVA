package javaproject;

public class Person{
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}

	public static void main(String[] args) {
		Person myObj = new Person();
		myObj.setName("JAMUNA RANI");
		System.out.println(myObj.getName());
	}
}