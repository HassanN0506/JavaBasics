package com.syntax.class03;

public class N7_PrimitiveCasting {

	//main+ctrl+space, then doubleclick "main" or hit enter button to autocomplete writing Main method
	public static void main(String[] args) {
		
		int i=10;
		
		//widening or implicit
		//we stored int value 10 inside Double variable
		double d=10;
		
		System.out.println(i); //10
		System.out.println(d); //10.0
		
		int abc = (int)20.0;
		System.out.println(abc);
		//if we do int abc=20.0; its a Type mismatch: cannot convert from double to int
		//so we must format it as abc=(int)20.0 
		//we have to specify after the equal sign that we definitly want it as an int
		
		//narrowing or explicit casting
		//we store Double value 10.99 into int variable
		int num=(int)10.99;
		System.out.println(num); //rounded DOWN
		
		float f=10.99f; //Type mismatch: cannot convert from double to float
		
		byte b=(byte)1000; //to FORCE java to store a larger number into the same small box
		System.out.println(b);//(binary) data was lost, so we get a weird result
	
		long number=123456789123456789l;
		System.out.println(number);
		//narrowing
		int numb=(int)number; // integer version of 'number'
		System.out.println(numb);
		
		long a = 123123l;
		double a1 = a;
		System.out.println(a1);
		
	}
	
}
