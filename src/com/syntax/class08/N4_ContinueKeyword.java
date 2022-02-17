package com.syntax.class08;

import java.util.Scanner;

public class N4_ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++) {
			
			if(i==3 || i==6) { 
				continue; // 'Continue' means to SKIP the CURRENT iteration/cycle (when i==3 or i==6)
			} 
			/*
			 * used OR in if statement, 
			 * because if it were AND, 
			 * 'i' can't be both numbers AT THE SAME TIME, 
			 * so it would've always been False (if we used &&)
			 */
			
			System.out.println(i+" Hello");	
		}
		//so it should have skipped 3 and 6
		/*
		 * and the IF condition must be BEFORE the println, !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 * so that each cycle will run thru the if statement
		 * 
		 * if 'println' were to come after 'if', 
		 * the statement will print before even running thru to check the 'if' condition,
		 * and THEN skip whatever command comes AFTER the 'if' statement
		 */
		
		
		System.out.println("---------------------------------------------");
		//i want to print all numbers from 1 to 10 except number 4 and 7
		for(int a=1; a<=10; a++) {
			
			if(a==4 || a==7) {
				continue;
			}
			
			System.out.print(a+" ");
			
		}System.out.println();
		
		
		System.out.println("---------------------------------------------");
		//print numbers 1 to 50 except those that are divisible by 3
		for(int b=1; b<=50; b++) {
			if(b%3==0) {
				continue;
			}
			System.out.print(b+" ");
		}System.out.println();
		
		
		System.out.println("---------------------------------------------");
		/*Create a program that will keep asking user to apply for a credit card. 
		As soon you get “yes” from a user program should stop asking.
		*/
		Scanner sc = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Apply for a credit card?");
			answer = sc.nextLine();
		}while (!answer.equalsIgnoreCase("yes"));
		
		sc.close();
		
		for(int i=0; i<4; i++) {
			//code A;
			continue; 
			/* when there is no if statement, CONTINUE will just
			 *  skip past the very next line of code. */
			//code b;
		} 
		//so this'll print Code A 4 times. 
		//Java will say UNREACHABLE CODE ERROR
		
	}

}
