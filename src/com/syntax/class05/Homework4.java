package com.syntax.class05;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		/*
		 * Write a program that will ask user to input the current time (use 24 hour format).
		 * Based on the given time define:
		 * if hour is between 1-11 --> Morning
		 * if hour between 12-15 --> Afternoon
		 * if hour between 16-20 --> Evening
		 * if hour between 21-24 --> Night
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter the present hour, using 24-hour format");
		int time = sc.nextInt();
		
		if (time >= 1 && time <= 11) {
			System.out.println("It is morning");
		} else if (time >=12 && time <=15) {
			System.out.println("It is afternoon");
		} else if (time >=16 && time <= 20) {
			System.out.println("It is evening");
		} else if (time >=21 && time <=24) {
			System.out.println("It is night");
		} else if (time == 0) {
			System.out.println("It is midnight");
		} else {
			System.out.println("Invalid entry");
		}
	}

}
