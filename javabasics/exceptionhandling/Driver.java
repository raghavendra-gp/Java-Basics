package com.te.javabasics.exceptionhandling;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the amount to withdraw: ");
		int withAmt = scanner.nextInt();
		Bank per1 = new Bank(20000);
		//try {
			per1.withDraw(withAmt);
//		} catch (InsufficientFund e) {
//			System.out.println(e.getMessage());
//		}

	}

}
