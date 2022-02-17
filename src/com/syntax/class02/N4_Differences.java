package com.syntax.class02;

public class N4_Differences {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="Bye";
		
		int c=10;
		int d=20;
		
		System.out.println(c+d+a+b);
		//c+d will happen first; it will add to make 30, and then put HelloBye after it = 30HelloBye
		//So "+" could mean addition, or it could mean concatenation
		
		System.out.println(a+b+c+d);
		/* Java will do (a+b) first, which are 2 String values, so it will concatenate
*then, it will do the String of (HelloBye+a) which is a String and the numeric value of c (10), so it will CONCATENATE to make a new String of HelloBye10
		 *then, it will add the String of (HelloBye10) to the numeric value of d (20), and CONCATENATE to make a string of HelloBye1020   
		 * so it will print HelloBye1020
		 * 
		 * when a String is before a numeric value, it will CONCATENATE
		 * 
		 * unless you put the numeric values in parenthesis, then it will do the parenthesis first, and then concatenate the sum of that with the String 
		 */
		//Example
		System.out.println(a+b+(c+d));
		//will be HelloBye30, because it did what's in the parenthesis first, and then concatenated the 30 on to the end of the String
		
		
		int num1=123;
		String num2="123";
		
		String what=num1+num2;
		
		System.out.println(what); //123123
		System.out.println(num1+num2); //123123
		
		//ORDER OF OPERATIONS
	}

}
