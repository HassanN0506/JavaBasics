package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		 * Please complete this assignment in 2 ways: using if statement and switch
		 * case.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your first number");
		double n1 = sc.nextInt();

		System.out.println("Please enter the arithmetical operator you wish to use");
		char op = sc.next().charAt(0);

		System.out.println("Please enter your second number");
		double n2 = sc.nextInt();
		
		double ans = 0;
		
		//if statement
		if (op == '+') {
			ans = (n1 + n2);
		} else if (op == '-') {
			ans = (n1 - n2);
		} else if (op == '*') {
			ans = (n1 * n2);
		} else if (op == '/') {
			ans = (n1 / n2);
		} else if (op == '%') {
			ans = (n1 % n2);
		} else {
			System.out.println("Error: Invalid arithmetical operator entered");
		}
		System.out.println("= "+ans);
	
		System.out.println("---------------------------------------------------------------------------------------------");
		
		//switch case
		switch (op) {
		
		case '+':
			ans = (n1 + n2);
			break;
			
		case '-':
			ans = (n1 - n2);
			break;
			
		case '*':
			ans = (n1 * n2);
			break;
		
		case '/':
			if (n2 != 0) {
				ans = (n1 / n2);
			}else {
				System.out.println("Cannot divide by zero");
			}
			break;
		
		case '%':
			ans = (n1 % n2);
			break;
		
		default:
			System.out.println("Error: Invalid arithmetical operator entered");
		}
		System.out.println("= "+ans);
		
	}

}
