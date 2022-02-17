package com.syntax.class04;

import java.util.Scanner;

public class N3_MoreExample {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your FULL NAME");
		
		String firstName = in.next(); 
		System.out.println(firstName);
		//.next(); can only capture 1 WORD. It will only capture a String input up until a space (" ")

		//if you need to capture more than 1 word, use "String name".nextLine();
		
		System.out.println("Please enter your FULL NAME again");
		String fullName = in.nextLine();//.nextLine();
		
		System.out.println(fullName);//now, it captured the ENTIRE LINE of input
	}

}
