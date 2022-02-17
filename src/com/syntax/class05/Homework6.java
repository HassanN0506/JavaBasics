package com.syntax.class05;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. 
		 * Based on the month define the season.
		 * Example: 
		 * if user is born in March, April, May → season =“Spring” 
		 * if user is born in June, July, August → season =“Summer”  etc …
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter your birth month");
		String month = sc.nextLine();
		
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			System.out.println("You were born in Winter");
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You were born in Spring");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("You were born in Summer");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("You were born in Fall");
		} else {
			System.out.println("Invalid entry");
		}
		
	}

}
