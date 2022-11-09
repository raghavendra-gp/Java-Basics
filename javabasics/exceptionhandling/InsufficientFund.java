package com.te.javabasics.exceptionhandling;

//public class InsufficientFund extends RuntimeException {         //unchecked exception
public class InsufficientFund extends  Exception{					//checked exception

	InsufficientFund(String message) {
		super(message);
	}

}




/* when checked exception is used you are suppsed to use catch block*/ 
//Default handler in JVM is called