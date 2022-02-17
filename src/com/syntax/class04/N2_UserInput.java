package com.syntax.class04;

import java.util.Scanner; //we need to import Scanner into our class

public class N2_UserInput {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);//creating a Scanner called "input"
		
		System.out.println("Please enter your name");
		
		//if you want to capture single String --> use "scanner name".next();
		
		String name = input.next(); 
		//type your String and hit enter (in console box)
		//whatever you entered in the console, that is saved as the String "name"
		
		System.out.println("Your name is "+name);
		
		//if you want to capture int --> use nextInt();
		
		System.out.println(name+", please enter your age");
		
		int age = input.nextInt(); 
		//type Integer and hit enter (in console box)
		//whatever you entered in the console, that number is saved as the int "age"
		
		System.out.println("Your name is "+name+" and your age is "+age);
		
	}

}