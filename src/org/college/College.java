package org.college;

public class College {
	
	public void collegeName() {
		
		System.out.println("College Name : PSG");

	}
	
	public void collegeCode() {
		System.out.println("College Code is : 007");

	}
	
	public void collegeRank() {
		System.out.println("College Rank is : 05");

	}
	
	public static void main(String[] args) {
		
		College c = new College();
		c.collegeCode();
		c.collegeName();
		c.collegeRank();
	}

}
