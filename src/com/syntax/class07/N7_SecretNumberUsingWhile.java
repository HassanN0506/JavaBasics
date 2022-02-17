package com.syntax.class07;

import java.util.Scanner;

public class N7_SecretNumberUsingWhile {

	public static void main(String[] args) {

		/* USING WHILE!!!!!!!!!!!!!!!!!!! 	
		 * create a secret number 1-21
		 * 
		 * we want the user to guess the secret number
		 * the moment user guesses the secret number, the program should stop
		 * otherwise, it should continue asking to guess the secret number
		 */
		
		int secretNumber=12;
		int guessNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess a number 1-21");
		guessNumber = sc.nextInt();
		
		while(guessNumber != secretNumber) {
			System.out.println("Guess a number 1-21");
			guessNumber = sc.nextInt();
		}
		
		System.out.println("CORRECT!!!!!!!!!!!!!!!!");
	}

}
