package com.syntax.class02;

public class N2_ArithmeticOperators {

	public static void main(String[] args) {
		
		/* "=" is an "assignment operator" 
		 * arithmetical operators: +, -, *, /, %.
		 */
		
		int num1=10;
		int num2=3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		// num1/num2 is rounded to 3, because it is an INTEGER
		// to get an accurate result, make the numbers USED decimal values 
		
		double num3=10;
		double num4=3;
		System.out.println(num3/num4);
		
		float num5=10f;
		float num6=3f;
		System.out.println(num5/num6);
		//Float cannot hold as many numbers as Double, so it gets rounded to the nearest decimal point it can
		
		
		// % means Remainder 
		int i=10;
		int j=3;
		System.out.println(i%j);
		// remainder of the result of 10/3
		//shows 1, because the remainder of the result (.3333)gets rounded up to 1 (because int).
		
		
		int n1=20;
		int n2=3;
		//you can make a variable that is the sum of 2 other variables: 
		int sum=n1+n2; //is 23. SAVED AS INT BECAUSE 2 INTEGERS ADDED IS AN INTEGER
		int sub=n1-n2;
		int div=n1/n2;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		//for division, it will be rounded, because n1 and n2 are (both inputs) are int
		//if you want accurate decimal numbers, use inputs that are doubles or floats
		
		double d1=20;
		double d2=3;
		double product=d1/d2;
		System.out.println(product);
		//that is the most accurate result
		
	}

}
