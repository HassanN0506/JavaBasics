package com.syntax.reviewClass3;

import java.util.Scanner;

public class Notes2_7 {

	public static void main(String[] args) {
		
	//		 if you highlight a piece of code and
	//		 * hit Ctrl + '/' (on the question mark key),
	//		 * it comments out that block of code
		 
		/* 
		 * '==' works only for PRIMITIVE data types 
		 * non-primitive data types (STRING) must use " .equals() "
		 * 
		 * once you start debugging (after placing a breakpoint), 
		 * you can highlight a condition in a particular statement,
		 * right click, and click on "watch"
		 * then that condition shows up under the "expressions" tab (next to variables tab)
		 * and when (and IF) that condition is found True
		 * the table should show it as "true" instead of Error,
		 * once the debugger is on that line of code.
		 * 
		 * ' if(day.equals("Monday")) ' and ' if("Monday".equals(day)) ' are the SAME THING!!
		 * ' if(num==10) ' and ' if(10==num) ' , SAME THING!!		 
		 * 
		 * whenever possible, ALWAYS go for switch statements 
		 * 
		 * instead of always using a nested if, use && or ||, WHENEVER APPLICABLE. 
		 * it makes code shorter and faster, and easier to edit.
		 * 
		 * 
		 * 
		 */
		
		
		String name= "H";
		String pass= "N";
		if(name.equals("H") && pass.equals("N")) {
			System.out.println("Enter");
		} else {
			System.out.println("Try again");
		}
		
		
		int age=13;
		if(age>=13) {
			System.out.println("You can play this game");
		}else {
			System.out.println("You can't play this game");
		}
		
		
		String country="USA";
		if(!country.equals("USA")) { //use '!' to exclude all but 1 (or a few) conditions
			System.out.println("You can't pay from USA");
		} else {
			System.out.println("You are allowed");
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		System.out.println(num);
		System.out.println("Enter full name");
		sc.nextLine(); //if you comment out this line, you'll get THAT damned error
		/*
		 * the enter you hit gets stored in this variable
		 * so you can either create a new scanner and use THAT to capture this input string
		 * OR an easier way is to put ANOTHER sc.nextLine() here
		 * and that way, the enter will be captures in the 1st sc.nextLine()
		 * and the actual input string will be stored in sc.nextLine()
		 * 
		 * just remember, the FIRST one stores the enter 
		 * the SECOND one actually stored the input string
		 * so you must declare (name) the SECOND variable in order to use it in your code.
		 */
		String fullName=sc.nextLine();
		System.out.println(fullName);
		System.out.println("End");
		
		
	}

}
