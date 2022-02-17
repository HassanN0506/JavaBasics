package com.syntax.class02;

public class N3_NonPrimitiveType {

	public static void main(String[] args) {

		// String is anything that is a string of characters
		// String must be in "double quotes"

		String name = "Hassan";
		String lastName = "Nawaz";

		long phoneNumber = 1234567890L;
		// with hyphens, add double quotes, and it can be a string
		String mobileNumber = "123-456-7890";

		String greeting = "Hello Friends!";
		System.out.println(greeting);

//syso+ctrl+space --> autocomplete print statement 
//shortcut to format ctrl+shift+f

		System.out.println(name + lastName);
		// you can combine 2 string values with a plus sign
		System.out.println(name + " " + lastName);
		/*
		 * you can add a space in double quotes. this is called "Concatenate" Using + we
		 * can concatenate String + string String+ int String + boolean etc.
		 */

		// to say "Hassan is 24 years old.":
		int age = 24;
		System.out.println(name + " is " + age + " years old.");

		String address = "123 Test Street";
		// to say "I live on 123 Test Street.":
		System.out.println("I live on " + address + ".");

		String feeling = "like";
		String food = "kebab";
		// I like kebab.
		System.out.println("I " + feeling + " " + food + ".");

		feeling = "love";
		food = "shrimp";
		// I just reassigned those 2.

		// copy paste previous line.
		System.out.println("I " + feeling + " " + food + ".");
		// says "I love shrimp." in the next line after "I like kebab."

	}

}
