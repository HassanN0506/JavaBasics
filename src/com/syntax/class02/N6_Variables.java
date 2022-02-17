package com.syntax.class02;

public class N6_Variables {

	public static void main(String[] args) {
		
		String name="Hassan";
		String lastName="Nawaz";
		char grade='A';
		String city="Woodbridge";
		String state="Virginia";
		String phoneNumber="703-456-7890";
		
		System.out.println("My name is "+name+", and my last name is "+lastName);
		System.out.println("I am an "+grade+" student");
		System.out.println ("I live in "+city+", "+state);
		System.out.println("And my phone number is "+phoneNumber);
		
		city="Denver";
		state="Colorado";
		grade='Z';
		phoneNumber="123-456-7890";
				
		System.out.println("My name is "+name+" "+lastName);
		System.out.println("I am a "+grade+" student");
		System.out.println("I moved to "+city+", "+state);
		System.out.println("My new number is "+phoneNumber);
		

	}

}
