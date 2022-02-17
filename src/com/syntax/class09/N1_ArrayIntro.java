package com.syntax.class09;

public class N1_ArrayIntro {

	public static void main(String[] args) {
		
		//arays are a collection of values (of the same data type)
		
		int num=10; //1 variable can hold only 1 value at a time
		
		 int[] numbers= {10, 20, 30, 40, 50}; 
		 //1 array can hold multiple values (of the same data type) at the same time
		 //each number inside the array is called an 'ELEMENT'
		 
		 /* name of the array is 'numbers'
		  * 10's index is [0] !!!!!!!!!!!!! INDEX ALWAYS STARTS AT 0 !!!!!!!!!!!!!!
		  * 20's index is [1]
		  * 30's index is [2]
		  * 40's index is [3]
		  * 50's index is [4]
		  */
		 
		//to print a specific number in the array, syntax is: " syso(arrayName[index]); " 
		System.out.println(numbers[0]); //10
		System.out.println(numbers[3]); //30
		
		
		
		// LONGER WAY TO DO THE SAME THING:
		
		// creating an array that holds 4 integer values:
		int[] digits = new int[4]; 
		
		// setting the value of each element inside the array:
		digits [0]=90;
		digits [1]=87;
		digits [2]=89;
		digits [3]=99;
		
		// print the number 99 (from inside the array):
		System.out.println(digits[3]);
		
		// print the sum of 2 elements:
		System.out.println(digits[3]+digits[0]);
		
		
		
		// I want to create an array of countries:
		String[] countries = new String[5];
		countries [0] = "USA";
		countries [1] = "Mexico";
		countries [2] = "Russia";
		countries [3] = "China";
		countries [4] = "Iran";
		/*
		 * countries [5] = "Sudan"; 
		 * ERROR ArrayIndexOutOfBoundsException 
		 * (only room for  4 elements in this array)
		 */
		
		System.out.println(countries[4]+" & "+countries[3]);
		
		
		
		//another
		String[] names = new String[5];
		names[1]="Jack";
		names [2]="John";
		names [3]="James";
		
		System.out.println("Value in index 0 is: "+names[0]);
		/* every element you didn't assign a value to is NULL 
		 * (bc that's the default value of a String)
		 * 
		 * so every element is there, because you've created all of them
		 * but since you didn't assign any values to some of them,
		 * those elements are set to their default values.  
		 */
		System.out.println("Value in index 4 is: "+names[4]);
		
		
		
		//you can change any value of an element
		System.out.println("The value of names[1] is currently: "+names[1]);
		names [1]="Hassan";
		System.out.println("The value of names[1] is now: "+names[1]);
		
		
		
		/* TASK:
		 * create an array to store 4 different prices
		 * find the average of how much we spent
		 */
		double[] prices = new double[4];
		prices[0]=1.00;
		prices[1]=1.00;
		prices[2]=2.00;
		prices[3]=2.00;
		
		double average = (prices[0]+prices[1]+prices[2]+prices[3])/4;
		System.out.println("The average of how much we spent is: $"+average);
		
	}
}
