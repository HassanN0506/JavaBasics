package com.syntax.class07;

public class N3_WhileLoopDemo {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("The value of 'i' outside of while loop = "+i);
		System.out.println("-------------------------------------------");
		
		// I need to print even values from 2 to 20
		
		int a = 2;
		while(a<=20) {
			System.out.println(a);
			a+=2;
		}
		
		
		//I need to print values from 1 to 50 ALL IN 1 LINE
		
		int b = 1;
		while(b<=50) {
			System.out.print(b+" ");
			b++;
		}
		System.out.println(); // so that the NEXT output is on the next line 
		
		
		// I need numbers from 20 to 1 in 1 line
		
		int c = 20;
		while (c>=1) {
			System.out.print(c+" ");
			c--;
		} 
		System.out.println();
		
		
		System.out.println("The End");
		
	}

}
