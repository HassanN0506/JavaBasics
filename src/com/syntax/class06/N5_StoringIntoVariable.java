package com.syntax.class06;
import java.util.Scanner;

public class N5_StoringIntoVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

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
			
		} else if (average >= 70 && average < 90) {
			grade = 'B';
			
		} else if (average >= 50 && average < 70) {
			grade = 'C';
			
		} else {
			grade = 'F';
			
		}
		
		System.out.println("Your grade is "+grade);
		
		if (grade == 'A' || grade == 'B') {
			System.out.println("You are a good student");
		} else {
			System.out.println("Please study more");
		}
		
		
	}

}
