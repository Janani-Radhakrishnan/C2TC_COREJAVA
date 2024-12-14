package com.janani_r.assignment.utilities;

import com.janani_r.assignment.employees.Employee;
public class EmployeeUtilities {

	 public void printEmployeeDetails(Employee employee) {
	        System.out.println("Employee Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }
}
