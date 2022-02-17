package com.syntax.class04;

import java.util.Scanner;

public class Homework2 {
	
	public static void main(String[] args) {
		
		/* You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
		 */ 
			
			Scanner ageInput = new Scanner (System.in);
			
			System.out.println("What is your age?");
			int age = ageInput.nextInt();
			
			if (age >=18) {
				System.out.println("You may get your driver's license.");			
			} else {
				System.out.println("You can get your leaner's permit.");
			}
	}

}
