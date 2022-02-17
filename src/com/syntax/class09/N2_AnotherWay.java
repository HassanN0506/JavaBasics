package com.syntax.class09;

public class N2_AnotherWay {

	public static void main(String[] args) {
		
		//I want to create an array of colors
		
		String[] colors= {"red", "yellow", "green", "blue"};
		//we can assign values to elements inside an array all at once by using {curly brackets}
		
		//i want to say my favorite color is blue
		System.out.println("My favorite color is "+colors[3]);
		
		
		//another way to do it!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		String[] something; //declaring the array 1st
		something = new String [4]; //initializing it's values 2nd
		//and then you can store values inside the elements
		
		//but you CANNOT do this:
		String[] A; //declare the array 1st
		// " A[#] = {}; "
		//and store values inside the elements 2nd
		//you must initialize the array's values before you can store values inside the elements of that array
		A = new String [4];
		A[0]="";
		A[1]="";
		//and then you MUST set the values of the elements 1 at a time
		
		/*
		 * if you want to do it ALL AT ONCE, it must be in the same line
		 * example:
		 * String[] colors= {"red", "yellow", "green", "blue"};
		 * initializing, declaring, and setting the values of the elements all in the same line
		 */
		

		//*******************************************Tasks:*******************************************************
//			 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
//			 * Then print a grade B (use 2 different ways of creating an array).

		char[] grades;
		grades = new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		
//		 * Create an array of names and store all names of your group. 
//		 * Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names;
		names = new String[3];
		names[0]="Jill";
		names[1]="Hassan";
		names[2]="Emily";
		System.out.println(names[1]);
		
		
//		 * Create an array of words: Java, Saturday, day, coding, is. 
//		 * Print the following sentence using elements of array: “Saturday is Java coding Day”. 
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
	}

}
