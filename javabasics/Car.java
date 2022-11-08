package com.te.javabasics;

public interface Car {
	
	void acclerate();
	void brakes();
	void gear();
	
	default void seats() {
		System.out.println("5 seater");
	}
}
