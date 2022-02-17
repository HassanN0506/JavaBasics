package com.syntax.class07;

public class N1_Notes2_5 {

	public static void main(String[] args) {
	
		/*
		Control flow statements:
			1. Conditional statements:
				if, else
				switch
			2. Loop statements: repeat block of code as long as condition is true
			
		Why do we need them?
		
		System.out.println(“hello”);
		System.out.println(“hello”);
		System.out.println(“hello”);
		System.out.println(“hello”);
		System.out.println(“hello”);
		
			4 Loops in Java:
			While 
			Do while
			For loop
			Enhanced for loop/ advanced for loop/ for each loop
		
		While is loop → repeats block of code while a condition is true;
	—-----------------------------------------------------------------------------------------------------------------------
		*/
		int time = 17;
		
		while (time>12) { //will print morning 5 times
			System.out.println("Morning");
			time--;
			System.out.println("Value of time now: "+time);
		}
		System.out.println("-------loop has been exited-----------");
		System.out.println("Value of time now: "+time);
		
		/*
		 * do while loop --> repeats block of code as long as condition is true
		 * do while syntax:
		 * 
		 * do {
		 * 		code to execute
		 * 	} while (condition);
		 * 
		 *  !!!!!!!!!!do while checks the condition AFTER executing the block of code the 1st time
		 *  then it loops back for the second time and so on
		 *  (So there will always be at least 1 output with do-while)
		 *  
		 *  do while is used less often than while
		 *  
		 *  do while loop used in java when we don't know, in advance, how many times we want to repeat the code
		 *  (example of guess number)
		 *  
		 *  
		 *  
		 *  for loop --> MOST WIDELY USED loop in java
		 *  
		 *  i want to say hello 5 times
		 *  
		 *  for(int i=1; i<=5; i++){  //everything is done in this 1 line
		 *  	syso("hello");
		 *  }
		 *  
		 *  you cannot say 'i+2', you must say 'i+=2' (same as saying 'i=i+2')
		 */
		
	}
}
