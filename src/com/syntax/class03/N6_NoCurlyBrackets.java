package com.syntax.class03;

public class N6_NoCurlyBrackets {

	public static void main(String[] args) {

		boolean weekend = true;

		if (weekend)
			System.out.println("I have java classes at Syntax");
		else
			System.out.println("I might have other classes or day off.");
			System.out.println("I will enjoy this day");
		/*
		 * with no {} in if statements, java can only identify 1 statement per if and 1 per else statement.
		 * So, Java thinks System.out.println("I will enjoy this day"); is no longer part of the ifElse statement, 
		 * and java will print it ALWAYS after executing what it percieves to be the ifElse statement.
		 * 
		 * that is why, it is always best to use {} in ifElse statements
		 */

		System.out.println("End of code");
		
		
		

	}

}
