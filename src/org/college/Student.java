package org.college;

public class Student {
	
	public void studentName() {
		System.out.println("Student Name is : DIYA");

	}
	
	public void studentDept() {
		
		System.out.println("Student Department : Chemistry");

	}
	
	public void StudnetID() {
		
		System.out.println("Student ID is : 16CH060");

	}

	public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.StudnetID();
	}
}
