package org.sr.practice;

import java.util.List;

class Employee {
	private String name;
	private String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}

}

public class FilterEmployee {
	private static final String TARGET_DEPARTMENT = "cse";

	public static void main(String[] args) {

		List<Employee> empList = List.of(new Employee("Azaz", "CSE"), new Employee("Shamshee", "IT"),
				(new Employee("Amaan", "CSE")));

	}

	static List<Employee> get(List<Employee> empList) {
		return empList.stream()
				.filter(emp -> "cse".equalsIgnoreCase(emp.getDepartment()) || emp.getName().startsWith("A"))
				.toList();
	}

}
