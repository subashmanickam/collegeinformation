package org.college;

public class Dept {
	public void deptName() {
		System.out.println("Department Name : Chemistry");

	}
	
	public static void main(String[] args) {
		Dept d = new Dept();
		d.deptName();
		
		Hostel h = new Hostel();
		h.hostelName();
		
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.StudnetID();
		
		College c = new College();
		c.collegeCode();
		c.collegeName();
		c.collegeRank();
	
	
	
	}
	

}
