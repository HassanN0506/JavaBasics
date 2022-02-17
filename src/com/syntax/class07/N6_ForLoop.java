package com.syntax.class07;

public class N6_ForLoop {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++){  //everything is done in this 1 line
			System.out.println("hello");
		}
		
		/* 1. int is set to 1
		 * 2. condition is checked
		 * 3. code inside block is executed
		 * loops back around
		 * 4. int is incremented by 1
		 * 5. condition is checked
		 * 6. code inside block is executed (if condition is met)
		 * loops back around
		 * 7. int is incremented by 1
		 * 8. condition is checked
		 * 9. code inside block is executed (if condition is met)
		 * loops back around
		 * until the condition is found false
		 */
		
		System.out.println("I need to print numbers from 1 to 20");
		
		for (int a=1; a<=20; a++) {
			System.out.print(a+" ");
		}System.out.println();
		
		/*
		 * start point
		 * end point
		 * increment or decrement
		 */
		
		System.out.println("I need to print numbers from 10 to 25");
		
		for(int b=10; b<=25; b++) {
			System.out.print(b+" ");
		}System.out.println();
		
		
		System.out.println("**print numbers from 50 to 1**");
		
		for(int c=50; c>=1; c--) {
			System.out.print(c+" ");
		}System.out.println();
		
		
	}
}
