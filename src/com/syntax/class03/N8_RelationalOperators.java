package com.syntax.class03;

public class N8_RelationalOperators {
	public static void main(String[] args) {
		
		int num1=10;
		int num2=16;
		
		System.out.println(num1>num2);//false
		System.out.println(num1==num2);//false
		System.out.println(num1<num2);//true 
		
		//the result of relational values will always be a boolean value (True/False)
		
		boolean result=num1!=num2; // *10 is not equal to 16*. It is True.
		System.out.println("Result is "+result);//true 
		
		result=num1==num2; // *10 is equal to 16*. It is False.
		System.out.println("Result is "+result);//false
		
		/*  = and == mean 2 different things. 
		 *  = is an ASSIGNMENT operator. 
		 *  == is a RELATIONAL operator (meaning "is equal to", true or false?).
		 */
		
		System.out.println(num1=num2); 
		//you are assigning 16 to num1, and printing the value of num1.
		//REASSIGNING
		
		System.out.println(num1); //num1 is 16. Once again printing num1. 
		
		System.out.println(num1==num2); 
		//checking if num1 and num2 are equal, it is True. 
		//COMPARING
		
	}

}
