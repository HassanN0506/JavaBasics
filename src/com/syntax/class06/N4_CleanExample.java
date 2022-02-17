package com.syntax.class06;

public class N4_CleanExample {

	public static void main(String[] args) {
		
		/*
		 * find out the largest number out of the 3 given numbers 
		 * and then define whether the largest number is even or odd 
		 */

		int num1 = 1000;
		int num2 = 200;
		int num3 = 3001; 
		
		int largest = 0; 
		/* we must INITIALIZE this variable (give it a value), in case none of the If conditions are true. 
		 
		 * Example: if they were all the same number, there would be no Largest number, 
		 * and therefore Java would not know what to print out for "The largest number is ..."
		 
		 * so this is only here in case NONE of the If Else statements are found true (kind of like a place holder)
		 * so the Compiler gave it the DEFAULT integer value (which is zero)
		 
		 * !!!!!!!!!!!!!!But remember, if you plan on doing something with the Largest variable,
		 * and none of the conditions are found true, we would then be working with the initialized ZERO value  
		 
		 
		 * (you COULD just add an Else statement at the end, so in case none of the If statements are true, 
		 * then the value of the Largest would be whatever we made it to be, in that last Else statement)
		 */
		
		if (num1 > num2 && num1> num3) {
			largest = num1;		
			
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
			
		} else if (num3 > num1 && num3 > num2) {
			largest = num3;
		} 
		
		System.out.println("The largest number is "+largest);
		
		if (largest%2 == 0) {
			System.out.println(largest+" is an even number");
		} else {
			System.out.println(largest+" is an odd number");
		}
		
	}

}
