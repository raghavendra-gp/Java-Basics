package com.te.javabasics.CompComperator;

import java.util.Comparator;

public class SortByStudentId implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		Integer i1 = o1.studentId;
		Integer i2 = o2.studentId;
		
		return i1.compareTo(i2);
	}

	
}
