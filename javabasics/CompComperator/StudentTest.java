package com.te.javabasics.CompComperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
	static ArrayList<Student> arrayList;
	static char ch;
	static Scanner scanner = new Scanner(System.in);

	public static void choiceMeth() {
		System.out.println("Press 1 to sort based on student ID");
		System.out.println("Press 2 to sort based on student Name");
		System.out.println("Press 3 to sort based on student Age");
		System.out.println("Press 4 to sort based on student Marks");

		System.out.println("Enter your choice ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			// System.out.println();
			Collections.sort(arrayList, new SortByStudentId());
			for (Object o : arrayList) {
				System.out.println(o);
			}
			break;
		case 2:
			Collections.sort(arrayList, new SortByStudentName());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		case 3:
			Collections.sort(arrayList, new SortByStudentAge());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		case 4:
			Collections.sort(arrayList, new SortByStudentMark());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		default:
			break;
		}

	}

	public static void main(String[] args) {

		Student student1 = new Student(10, "Apple", 21, 95);
		Student student2 = new Student(30, "Orange", 22, 93);
		Student student3 = new Student(40, "Grapes", 18, 97);
		Student student4 = new Student(50, "Muskmelon", 19, 96);
		Student student5 = new Student(60, "Watermelon", 24, 91);
		Student student6 = new Student(70, "Avocado", 21, 90);

		arrayList = new ArrayList<Student>();

		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);
		arrayList.add(student6);
		
		
			choiceMeth();

		do {
			System.out.println("Do you wanna soooooorttttt: (y/n)");
			ch = scanner.next().charAt(0);

			if (ch == 'y')
				choiceMeth();
			else
				System.out.println("Ba Byeee");
		} while (ch == 'y');

	}

}
