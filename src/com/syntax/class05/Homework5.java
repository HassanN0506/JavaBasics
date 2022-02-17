package com.syntax.class05;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) and determine the grade based on the following rules: 
		 * if the average score >=90 → grade=A
		 * if the average score >= 70 and <90 → grade=B
		 * if the average score>=50 and <70 → grade=C
		 * if the average score<50 → grade=F
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your Quiz score");
		double quiz = sc.nextDouble();
		
		System.out.println("Enter your Mid-term score");
		double midTerm = sc.nextDouble();
		
		System.out.println("Enter your Final score");
		double fin = sc.nextDouble();
		
		double average = ((quiz + midTerm + fin) / 3);
		char grade;
		
		if (average >= 90) {
			grade = 'A';
			System.out.println("Your grade is an "+grade);
		} else if (average >= 70 && average <90) {
			grade = 'B';
			System.out.println("Your grade is a "+grade);		
		} else if (average >=50 && average <70) {
			grade = 'C';
			System.out.println("Your grade is a "+grade);
		} else if (average < 50) {
			grade = 'F';
			System.out.println("Your grade is a "+grade);
		} else {
			System.out.println("ERROR");
		}
	}

}
