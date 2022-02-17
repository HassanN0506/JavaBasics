package com.syntax.class01;

public class N4_PrimitiveDataTypes {

	public static void main(String[] args) {
		/*
		 * 1st create a variable = box = container
		 * 2nd assign it a data type
		 * 3rd name the box
		 * 4th put in the value
		 * 5th add a ";"
		 
		 * to create a variable we need: 
		 		1. specify the data type
		 		2. give it a name
		 	
		 * THE NAME FOR EACH VARIABLE MUST BE UNIQUE!!!!!!	
		 */

		//numerical values:
		byte box1=10; //can only be used for small values.
		short box2=20; // can be used for a little longer values.
		
		int box3=30; //most used for all but long numbers.
		long box4=4000000000000000000L; //used for large values. 
		//Add "l" or "L" at the end of "long"
		
		
		//datatypes to represent DECIMALS:
		float price=12.99f; //add "f" or "F" at the end.
		//float can only hold up a few numbers.
		
		double price2=13.123456789123456789; //most used.
		//double can hold longer numbers.
		
		
		
		//non-numerical values:
		char gender='F'; 
		//char is used for single characters, and it must be in single quotes.
		char money='$';
		//char can be any single character, just not a number.
				
		boolean snow=false;
		boolean tired=true;
		//boolean is used to represent yes or no (true or false).
		
		
		
		//so if I want to print "12.99", I could:
		System.out.println(price);
		//because "12.99" was saved as "price"
	//and now, there is no yellow warning by "price", because we've used that variable.
		
		System.out.println("price");
		//will print " price " because we put double quotes around it.
		
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(price2);
		System.out.println(gender);
		System.out.println(money);
		System.out.println(snow);
		System.out.println(tired);
		
	}

}
