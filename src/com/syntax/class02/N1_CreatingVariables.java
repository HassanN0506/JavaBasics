package com.syntax.class02;

public class N1_CreatingVariables {
	
	public static void main(String[] args) {
		
		/*create a variable and assign a value.
		 * "Declare a variable" and "Initialize" 
		 * "initialization" only happens when you assign the value for the first time
		 * changing the value is just known as "reassigning" it
		 */
		
		//1
		int age=25; 
		
		//2
		int num;  //you can declare the variable first 
		num=10;  //and then initialize it later 
		
		//3
		int n1, n2, n3; //you can declare multiple variables of the same type at once
		n1=10;
		n2=20;
		n3=30; //and then initialize each one of them later, separately 
		
		
		/*You can reassign the value of a variable later on
		 * just name it and give it a new value. 
		*/
		age=26; //so it went from 25 to 26.
		/*
		 * do not Declare it again ("int age= "), 
		 * just reassign the value ("age= ")
		 * it must be the same type of value as the assigned data type (int, char, etc.)
		 *
		 * you can reassign a variable multiple times
		 * it can only hold 1 value at a time
		 */
		
		
		/*Java rules for identifiers
		 * boolean break=false; --> ERROR because "break" is a keyword in Java
		 * char 1ch='A'; --> ERROR 
		 * because you cannot start identifier (name) with a number 
		 * OR SPECIAL CHARACTER
		 * Java only allows "_" and "$" special characters at the start of identifiers
		 * but it is discouraged to even use those 
		*/
		
		/*Not rules, but we prefer to follow:
		 * variable and method names should start with lowercase
		 * give variables a meaningful name 
		 * if name is 2 or more words, Camel Casing
		 	* example: "int bigNumber=123456;"
		 * 
		 * class names should always start with uppercase
		 */
		
		
		
	}
}
