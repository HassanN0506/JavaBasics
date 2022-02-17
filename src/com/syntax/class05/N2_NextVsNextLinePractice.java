package com.syntax.class05;

import java.util.Scanner;

public class N2_NextVsNextLinePractice {

	public static void main(String[] args) {

		//next(); nextInt(); nextDouble(); nextBoolean(); next().charAt(0); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter yo age");
		int a = sc.nextInt();
		
		//sc.nextLine();
		
		System.out.println("Full name:");
		String fullName = sc.nextLine();
		
		System.out.println("Your full name is "+fullName+" and "+a);
		
	}

}
