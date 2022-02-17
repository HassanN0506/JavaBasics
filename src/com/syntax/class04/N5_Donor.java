package com.syntax.class04;

public class N5_Donor {

	public static void main(String[] args) {

		int age = 19;
		if (age >= 18) {
			
			double weight = 111;
			if (weight > 110) {
				System.out.println("You are eligible.");
			} else {
				System.out.println("You are not heavy enough.");
			}
			
		} else {
			System.out.println("You are not old enough.");
		}

	}
	
}