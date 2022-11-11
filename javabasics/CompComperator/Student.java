package com.te.javabasics.CompComperator;

public class Student {

	int studentId;
	String studentName;
	int studentAge;
	int studentMark;

	public Student(int studentId, String studentName, int studentAge, int studentMark) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMark = studentMark;
	}

	@Override
	public String toString() {
		return "[ " + studentId + ", " + studentName + ", " + studentAge
				+ ", " + studentMark + " ]";
	}
	

	
}
