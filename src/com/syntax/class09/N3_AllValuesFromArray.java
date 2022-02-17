package com.syntax.class09;

public class N3_AllValuesFromArray {

	public static void main(String[] args) {
		
		char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		//how many elements inside this array? use .length
		int size= grade.length; //arrayName.length
		System.out.println(size); //should be 6
		
		//to print out multiple elements in 1 go, use a loop
		//we know there are 6 elements in the array, (bc of .length)
		for(int i=0; i<grade.length; i++) { 
			System.out.print(grade[i]+"  "); //the index starts at 0 and ends 1 less than the size of the array
		}
		System.out.println();
		
		
		String[] cities= {"Washington DC", "Miami", "Denver", "Chicago"};
		for(int i=0; i<cities.length; i++) {
			System.out.println(cities[i]);
		}
		System.out.println("-------------------------------------------------------------");
		//i want to say "i want to live in Denver" whenever Denver comes up
		for(int i=0; i<cities.length; i++) {
			System.out.println(cities[i]);
			if("Denver".equals(cities[i])) {
			System.out.println("I want to live in Denver");
			}
		}
		
		
		
	}
}
