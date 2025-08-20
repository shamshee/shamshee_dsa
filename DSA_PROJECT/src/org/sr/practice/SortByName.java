package org.sr.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
	private String name;
	private int age;

	// constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}

public class SortByName {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Shamshee", 28));
		students.add(new Student("Haruka", 27));
		students.add(new Student("Praveen", 30));
		students.add(new Student("Amit", 25));

		System.out.println(get(students));

	}

	static List<Student> get(List<Student> students) {
		return students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).toList();
	}
}
