package com.te.javabasics.compcomexample;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee(10, "Super");
		Employee employee2 = new Employee(30, "Good");
		Employee employee3 = new Employee(50, "Marvelous");
		Employee employee4 = new Employee(70, "Awesome");
		Employee employee5 = new Employee(90, "Fantastic");
		Employee employee6 = new Employee(110, "S");

		ArrayList<Employee> arrayList = new ArrayList<Employee>();

		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);
		arrayList.add(employee5);
		arrayList.add(employee6);

		System.out.println("Before Sorting");
		for (Employee employee : arrayList) {
			System.out.println(employee);
		}
//		Collections.sort(arrayList);
//		System.out.println();
//		System.out.println("After sorting");
//		for (Employee employee : arrayList) {
//			System.out.println(employee);
//		}
		System.out.println("Sort by Id");
		Collections.sort(arrayList, new SortById());
		for (Employee employee : arrayList) {
			System.out.println(arrayList);
		}
		System.out.println();
		System.out.println("Sort by Name");
		Collections.sort(arrayList, new SortByName());
		for (Employee employee : arrayList) {
			
		}
	}

}
