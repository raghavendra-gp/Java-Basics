package com.te.javabasics;

public class Bmw implements Car {

	@Override
	public void acclerate() {
		System.out.println("BMW is Acceleratin");
		
	}
	
	@Override
	public void brakes() {
		System.out.println("BMW brakes are awesome");
		
	}
	
	@Override
	public void gear() {
		System.out.println("This has a fab transmission");
		
	}
	
	public void seats() {
		System.out.println("Sporty 2 seats");
	}
}
