package com.syntax.class03;

public class N2_MoreStatements {

	public static void main(String[] args) {
		
		/*
		 * Define a variable to store the value of a day. 
		 * If today is Saturday, I am having a Java class today.
		 * otherwise, I don't know which class I have.
		 */
		
		String day="Monday";
		if(day.equals("Saturday")) {
			System.out.println("I am having Java class today.");
		//you can always add more lines of output
			System.out.println("I am very excited.");
			System.out.println("I am going to have fun with my classmates.");
		} else {
			System.out.println("I don't know which class I have.");
			System.out.println("Maybe today is my day off.");
		}
		
	}

}
