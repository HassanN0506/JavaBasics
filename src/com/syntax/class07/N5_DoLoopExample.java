package com.syntax.class07;

import java.util.Scanner;

public class N5_DoLoopExample {

	public static void main(String[] args) {
		
		/*USING DO-WHILE!!!!!!!!!!!!!!!!!!!
		 * create a secret number 1-21
		 * 
		 * we want the user to guess the secret number
		 * the moment user guesses the secret number, the program should stop
		 * otherwise, it should continue asking to guess the secret number
		 */
		
		/*DECLARE the variable OUTSIDE of the DO body!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		(BC IF it WAS INSIDE THE DO BODY, it WOULD ONLY BE VISIBLE TO JAVA INDSIDE THAT SECIFIC BLOCK OF CODE)
		*/
		
		int secretNumber=12;
		int guessNumber;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Guess a number 1-21");
			guessNumber = sc.nextInt();
			
		} while (guessNumber != secretNumber);
		
		System.out.println("CORRECT!!!!!!!!!!!!!");
		
		sc.close();
		
	}

}
