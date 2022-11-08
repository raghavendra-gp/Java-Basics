package com.te.javabasics;

import java.util.Scanner;

public class CarFactory {
	
	public static Car getCar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the car name: ");
		String carName = scanner.next();
		
		switch (carName.toLowerCase()) {
		case "audi":
			return new Audi();
			
		case "bmw":
			return new Bmw();
		
		default:
			return null;
		}
	}

}
