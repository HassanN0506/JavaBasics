package com.syntax.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		// Print numbers from 1 to 100 in 1 line with space
		for (int a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		
		
		// Print numbers from 100 to 1
		for (int b = 100; b >= 1; b--) {
			System.out.print(b + " ");
		}
		System.out.println();
		
		
		
		//Print even numbers from 20 to 1 (2 ways)
		for(int c=20; c>=1; c--) {
			if((c%2)==0) {
			System.out.print(c+" ");
			}
		}
		System.out.println();
		//////////////////////// OR
		int c=20;
		while(c>=1) {
			if((c%2)==0) {
			System.out.print(c+" ");
			}
			c--;
		}
		System.out.println();
		
		
		
		//Print odd numbers between 20 and 50 (2 ways)
		for(int d=20; d<=50; d++) {
			if((d%2)!=0) {
				System.out.print(d+" ");
			}
		}
		System.out.println();
		//////////////////////// OR
		int d=20;
		while(d<=50) {
			if((d%2)!=0) {
				System.out.print(d+" ");
			}
			d++;
		}System.out.println();
		
		
		
		/*
		 * Declare a variable to store the price for a coffee. 
		 * Ask user to pay for a coffee. 
		 * 
		 * Keep asking the user to pay for a coffee until user enters exact amount. 
		 * If user gives more than for example $3 --> ask them to give less, 
		 * if user gives less money then ask to give more. 
		 * Once user got the right amount, print “Please enjoy your coffee”
		 */
		double coffeePrice = 3;
		Scanner in = new Scanner(System.in);
		double enteredPrice = 0;

		while (enteredPrice != coffeePrice) {
			System.out.println("Please enter how much you will pay for this coffee");
			enteredPrice = in.nextDouble();

			if (enteredPrice < coffeePrice) {
				System.out.println("Please give more,");
			} else if (enteredPrice > coffeePrice) {
				System.out.println("Please give less,");
			}
		}
		System.out.println("Please enjoy your coffee!");
		
		
		
		/*
		 * Ask a user to enter first name, last name and age 5 times. 
		 * Every time your program should print those values in the format: 
		 * “You name is _ _ and you are _ years old’
		 */
		
		String firstName = null;
		String lastName = null;
		int age = 0;
		
		int i=1;
		while(i<=5) {
			System.out.println("Please enter your first name");
			firstName = in.next();
			
			System.out.println("Please enter your last name");
			lastName = in.next();
			
			System.out.println("How old are you?");
			age = in.nextInt();
			
			System.out.println("Your name is "+firstName+" "+lastName+" and you are "+age+" years old");
			
			i++;
		}
		in.close();
		
	}

}
