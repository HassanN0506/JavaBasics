package com.syntax.class04;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {

		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a credit card?");
		System.out.println("Please answer Yes or No");

		String cc = scan.next();

		if (cc.equalsIgnoreCase("No")) {

			System.out.println("Would you like to apply for one?");

		} else if (cc.equalsIgnoreCase("Yes")) {

			System.out.println("What is the balance of your credit card?");
			double balance = scan.nextDouble();

			if (balance >= 1000) {
				System.out.println("You should pay that off immedietly!");
			} else {
				System.out.println("You can spend some more.");
			}

		} else {

			System.out.println("ERROR: answer not 'yes' or 'no'");
		}

	}

}
