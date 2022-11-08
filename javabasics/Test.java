package com.te.javabasics;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		

		Car audiCar = new Audi();
		Car bmwCar = new Bmw();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter audi/bmw: ");
		String carName = scanner.nextLine();

		switch (carName) {
		case "audi":
			audiCar.acclerate();
			audiCar.brakes();
			audiCar.gear();
			audiCar.seats();

			break;
		
		case "bmw":
			bmwCar.acclerate();
			bmwCar.brakes();
			bmwCar.gear();
			bmwCar.seats();
			
			break;

		default:
			System.out.println("Enter either audi/bmw");
			break;
		}

	}

}
