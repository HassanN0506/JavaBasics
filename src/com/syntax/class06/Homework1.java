package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter your grade");
		
		char grade = sc.next().charAt(0);
		
		String explination;
		
		switch(grade) {
		
		case 'A':
			explination = "Excellent";
			break;
		
		case 'B':
			explination = "Good";
			break;
	
		case 'C':
			explination = "Average";
			break;
		
		case 'D':
			explination = "Bad";
			break;
			
		default:
			explination = "Not Acceptable";
		}
		
		System.out.println(grade+" is "+explination);
		
	}

}
