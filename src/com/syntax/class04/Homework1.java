package com.syntax.class04;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
	/*
	 * You are a loan specialist and you need to ask user what is the amount of loan is needed. 
	 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
	 */
	
		Scanner loanInput = new Scanner (System.in);
		
		System.out.println("What is the amount of loan you need?");
		double loanAmount = loanInput.nextDouble();
		
		if (loanAmount <= 200000.00) {
			System.out.println("I will grant you this loan.");
		} else {
			System.out.println("I will not grant you this loan.");
		}

	}
}
