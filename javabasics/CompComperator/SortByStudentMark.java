package com.te.javabasics.CompComperator;

import java.util.Comparator;

public class SortByStudentMark implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentMark-o2.studentMark;
	}

}
