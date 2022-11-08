package com.te.javabasics.emp;

public class TestEmp {

	public static void main(String[] args) {

		EmpHelper empHelper = new EmpHelper();
		Employee employee = empHelper.getEmp();
		EmpDriver empDriver = new EmpDriver();
		empDriver.empDrive(employee);
	}

}
