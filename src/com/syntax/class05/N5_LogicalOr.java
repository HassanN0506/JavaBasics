package com.syntax.class05;

import java.util.Scanner;

public class N5_LogicalOr {

	public static void main(String[] args) {

		/*
		 * Logical operators: 
		 * And: && 
		 * Or: || 
		 * Not: !
		 * 
		 * (true || true) == true 
		 * (true || false) == true 
		 * (false || true) == true 
		 * (false || false) == false
		 */

		String day = "Saturday";

		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have java class today");
		}

		System.out.println("End of code");

		
		/*
		 * lets ask user what is today's day based on the day, lets define which class
		 * we have if (monday or friday) then no class else if (saturday or sunday) then
		 * java class else if (tuesday or wednesday) then manual class else if
		 * (thursday) then review class else (invalid day)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter today's day");
		day = sc.nextLine();

		if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
			System.out.println("There is no class today");

		} else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
			System.out.println("Today's class is Manual Testing");

		} else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("Today is a review class");

		} else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			System.out.println("Today's class is Java");

		} else {
			System.out.println("Invalid day entered");
		}

	}

}
