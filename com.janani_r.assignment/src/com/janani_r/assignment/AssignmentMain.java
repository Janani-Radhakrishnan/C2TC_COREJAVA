package com.janani_r.assignment;
import com.janani_r.assignment.employees.Manager;
import com.janani_r.assignment.employees.Developer;
import com.janani_r.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
	 public static void main(String[] args) {
	        // Create Manager instance
	        Manager manager = new Manager();
	        manager.setName("Alice");
	        manager.setEmployeeId(101);
	        manager.setSalary(90000);
	        manager.setDepartment("IT");

	        // Create Developer instance
	        Developer developer = new Developer();
	        developer.setName("Bob");
	        developer.setEmployeeId(102);
	        developer.setSalary(80000);
	        developer.setProgrammingLanguage("Java");

	        // Use EmployeeUtilities to print details
	        EmployeeUtilities utilities = new EmployeeUtilities();
	        System.out.println("Manager Details:");
	        utilities.printEmployeeDetails(manager);

	        System.out.println("\nDeveloper Details:");
	        utilities.printEmployeeDetails(developer);
	    }
}
