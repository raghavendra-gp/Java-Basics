package com.te.javabasics.exceptionhandling;

public class Bank {

	int bal;

	Bank(int bal) {
		this.bal = bal;
	}

	public void withDraw(int amt) throws InsufficientFund {
		if (this.bal > amt)
			System.out.println("withdraw succesfull");
		else {
			throw new InsufficientFund("Insufficient Fund!!");
		}
	}

}
