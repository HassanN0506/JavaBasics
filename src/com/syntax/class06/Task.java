package com.syntax.class06;

import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		
		/*
		 * ask user to enter their country and capture it
		 * once the values are captures print which language the user speaks
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter your country");
		String country = sc.nextLine();
		
		sc.close(); // to close the Scanner, so that no further information can be input into the console
		
		String language;
		
		switch (country.toUpperCase()) {
			default:
				language = "UNKNOWN";
				break;
			case "USA":
				language = "English";
				break;
			case "MEXICO":
				language = "Spanish";
				break;
			case "FRANCE":
				language = "French";
		}
		
		System.out.println("You speak "+language);
		
	}
}
