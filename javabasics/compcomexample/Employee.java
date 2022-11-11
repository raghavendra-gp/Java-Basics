package com.te.javabasics.compcomexample;

public class Employee implements Comparable<Employee> {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "[ " + empId + ", " + empName + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empName.compareTo(o.empName);
	}
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.empId - o.empId;
//	}
}
