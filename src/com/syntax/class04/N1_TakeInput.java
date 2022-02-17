package com.syntax.class04;
		//!!!!!!!!!!! to auto import Scanner from the Java library: ctrl+shift+o !!!!!!!!!!!!
import java.util.Scanner;

public class N1_TakeInput {

	public static void main(String[] args) {
		
		//1. create Scanner, and assign it to a variable (name it)
		Scanner scan = new Scanner(System.in);
		//!!!!!!!!!!! to auto import Scanner from the Java library: ctrl+shift+o !!!!!!!!!!!!
		
		//2. specify input instructions 
		System.out.println("Please enter country you are from");
		
		/*3. now we need to capture a String value (for the country name), 
		 * 	 so use "String name".next(); 	*/
		String country= scan.next();
		
		//4. now that input is saved as a String variable named country, and you can use it in your code  
		System.out.println("You are from "+country);
		
		// if you are from USA --> you speak English
		// if you're from France, you speak French
		if (country.equalsIgnoreCase("USA")) { 	//.equalsIgnoreCase(); will ignore the casing
			System.out.println("You speak English");
			
		} else if (country.equals("France")) {
			System.out.println("You speak French");
			
		} else {
			System.out.println("I do not know what language you speak");
		}
		
	//!!!!!! .equalsIgnoreCase(); will ignore the casing of whatever is inside the () !!!!!!!
	//!!!!!! .equalsIgnoreCase(); will ignore the casing of whatever is inside the () !!!!!!!
	//!!!!!! .equalsIgnoreCase(); will ignore the casing of whatever is inside the () !!!!!!!
		
	}

}
