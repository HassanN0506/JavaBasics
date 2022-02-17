package com.syntax.class04;

public class Task {

	public static void main(String[] args) {

		boolean diploma = false;
		if (diploma) {
			System.out.println("Congratulations!");
			
			double gpa = 3.5;
			if (gpa >= 3.5) {
				System.out.println("You are eligible for a scholarship.");
			} else {
				System.out.println("You should have studied harder.");
			}

		} else {
			System.out.println("You should get a degree.");
		}

		System.out.println("-----------------------------------------------------------");

		double mRate = 4.4;
		if (mRate <= 4.5) {
			double mPrice = 45000;
			if (mPrice > 50000) {
				System.out.println("You should take a loan.");
			} else {
				System.out.println("You can pay cash.");
			}
		} else {
			System.out.println("You can not buy a house.");
		}

	}

}
