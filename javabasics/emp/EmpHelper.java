package com.te.javabasics.emp;

import java.util.Scanner;

public class EmpHelper {

	public Employee getEmp() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the company name: ");
		String comName = scanner.next();

		if (comName.equalsIgnoreCase("hcl")) {
			return new Hcl();
		} else if (comName.equalsIgnoreCase("acenture")) {
			return new Accenture();
		}
		else {
			return null;
		}
	}
}
