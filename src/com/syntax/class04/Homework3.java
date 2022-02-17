package com.syntax.class04;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("What city do you live in?");
		String city = input.nextLine();

		System.out.println("What is the current tempreture, in Fahrenheit, in " + city + "?");
		int tempF = input.nextInt();

		int tempC = ((tempF - 32) * 5) / 9;
		System.out.println("The current tempreture in " + city + " is " + tempC + " degrees celsius.");

	}

}
