package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	public UUID SectionID;
	public UUID StudentID;
	public UUID EnrollmentID;
	public double Grade;


	private Enrollment() {
		
	}
	private Enrollment(UUID StudentID , UUID SectionID) {
		this.SectionID = SectionID;
		this.StudentID = StudentID;	
		set.EnrollmentID = new EnrollmentID;
	}
	
	public void SetGrade(double grade) {
		
	}
	
}