package com.syntax.reviewClass2;

public class Notes1_27 {

	public static void main(String[] args) {
		
		/*
		 * + - * / %  
		 */
		int number1=10;
		int number2=3;
		System.out.println(number1+number2);
		
		String name1="Abdul";  
		String name2="Gulnar";
		System.out.println(name1+name2);
		
		char letter1='A'; //65
		char letter2='B'; //66
		//System.out.println((int)'A'); cast a char into an int and print it to see the number value of that char
		System.out.println(letter1+letter2); // 65 + 66 = 131
		/***********************************************************************************************/
		System.out.println("----------------------------------------------------");

		System.out.println(number1-number2);
		//System.out.println(name1-name2); is not defined
		System.out.println(letter1+letter2); // 65 - 66 = -1
		/***************************************************************************************************/
		System.out.println("----------------------------------------------------");

		System.out.println(number1/number2);// it cuts off everything at and after the decimal
		
		double decimalAnswer = (number1/number2);//if you cast it into a decimal
		System.out.println(decimalAnswer);
		//it prints '3.0' , because it simply takes number1/number2 INT value, and puts a '.0' after it
		//so the best way is to cast the INTs into Doubles INDIVIDUALLY, and then do the operation with the doubles
		/********************************************************************************************/
		System.out.println("----------------------------------------------------");

		float number3=8f;
		float number4=3f;
		//when you put an f on the end, you are casting the ints 8 & 3 and storing them as floats
		System.out.println(number3/number4);
		//2.6666667 (java can only store so much data in a float)
		
		double number5=8;
		double number6=3;
		//you are casting ints 8 & 3 and storing them as doubles
		System.out.println(number5/number6);
		//2.6666666666666665 (java can store more data in doubles)
		
		System.out.println("----------------------------------------------------");

		float number7 = 5.3f;
		if (number7==5.3) { //when comparing it to the DECIMAL without the 'f', it is not equal
			System.out.println("Magic");
		} else {
			System.out.println("Simple math");
		}
		
		
		if (number7==5.3f) { //put an f on the end, and it IS equal
			System.out.println("Magic");
		} else {
			System.out.println("Simple math");
		}
		/*************************************************************************************************************/
		System.out.println("----------------------------------------------------");

		System.out.println(65%66);
	
		System.out.println(3%4);
		System.out.println(20%500);
		System.out.println(letter1%letter2);
		/*
		 * the modulus of CHAR the returns the remainder of the VALUES (and char's are stored as whole numbers, BTS) 
		 * when the remainder is less than 1, it just prints the value of the 1st number
		 */
		
		/*************************************************************************************************************/
		System.out.println("----------------------------------------------------");

		String a="ten";
		System.out.println(10+a+10);//concatination
		
		System.out.println(10+20+a+10+20);
		/* code executes left to right, 
		 * and once it starts concatinating, 
		 * it turns everything into a string
		 * so after the concatination starts, the rest of the + operators are used for concatination, not addition
		 * (unless you put parenthesis around it, ORDER OF OPERATIONS)  
		 */
		/*****************************************************************************************************/
		System.out.println("----------------------------------------------------");
		
		int number = 10;
		System.out.println(number);
		
		number++; //increase the value by just ONE
		System.out.println(number); //11
		
		number+=6; //increase the value by SIX
		System.out.println(number); //17 (11=6)
		
		System.out.println("************************");
		
		number = 10; //reset number to 10
		System.out.println(++number); //increase the value of the variable by 1, and THEN PRINT the number (11)
		
		number = 5; //set value of number to 5
		System.out.println(number++); 
		/*
		 * print the number, and THEN increase the value of the variable by 1 for the NEXT line of code
		 */
		System.out.println(number); //now number is 6, because of the PREVIOUS line of code
		
		/*
		 * so, ++BEFORE means to add 1 in the current line
		 * ++AFTER means to add 1 in the next line
		 */
		/*********************************************************************************************************/
		
		int z = 3;
		System.out.println(++z);
		
	}
}
