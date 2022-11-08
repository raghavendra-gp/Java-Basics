package com.te.javabasics;

public class Audi implements Car {
	
	@Override
	public void acclerate() {
		System.out.println("Audi is Accelerating");
		
	}
	
	@Override
	public void brakes() {
		System.out.println("Audi is braking");
		
	}
	
	@Override
	public void gear() {
		System.out.println("Audi as auto sports gears");
		
	}
	
//	@Override
//	public void seats() {
//		System.out.println("Luxury 4 seats");
//	}

}
