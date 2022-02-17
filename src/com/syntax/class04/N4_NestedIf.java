package com.syntax.class04;

public class N4_NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 2;

		if (vaccine) {
			System.out.println("How many doses do you have?");

			if (dose == 1) {
				System.out.println("You need another shot.");
			} else {
				System.out.println("You  are fully vaccinated.");
			}

		} else {
			System.out.println("I do not have any further questions.");
		}

		System.out.println("--------------------------------------------------------------------------------------");

		/*
		 * declare a variable for allergy
		 * 
		 * if you have allergy --> pollen allergy wheat allergy peanut allergy etc if no
		 * allergy --> you are lucky
		 */
		boolean allergy = false;

		if (allergy) { //outer if

			System.out.println("Let's check what allergies you have.");
			String allergyType = "peanut";
			
				//nested if --> always has a dependency on outer if.
				//outer if MUST be True in order for nested if to be checked.
				if (allergyType.equals("pollen")) {
					System.out.println("Please stay at home. Take medication A.");
				} else if (allergyType.equals("peanut")) {
					System.out.println("Please do not eat penuts. Take medication B.");
				} else if (allergyType.equals("gluten")) {
					System.out.println("Please do not eat gluten. Take medicatiopn C.");
				} else {
					System.out.println("I don't know which sugggestion to give you.");
				}

		} else {
			System.out.println("You are lucky.");
		}

	}

}
