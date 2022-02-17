package com.syntax.class07;

public class N4_DoWhileDemo {

	public static void main(String[] args) {
		
		int a=10;
		
		while(a<=3) {
			System.out.println("Hello"); 
			a++;
		} //will execute 3 times
		
		/**********************************************/
		System.out.println("---------------- DO WHILE -------------");
		
		int b=10;
		
		do {
			System.out.println("Hello");
			b++;
		} while(b<=3);
		
		
		System.out.println("I want to print numbers from 1 to 30 using do while loop.");
		
		int c=1;
		
		do {
			System.out.print(c+" ");
			c++;
		} while (c<=30);
		System.out.println();
		
		
		
		
	}

}
