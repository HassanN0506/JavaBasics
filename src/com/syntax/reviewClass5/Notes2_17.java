package com.syntax.reviewClass5;

public class Notes2_17 {

	public static void main(String[] args) {
		
		/*
		 * ALL conditions must be boolean (obviously)
		 * loop CONDITIONS (the condition part of a loop) must be boolean
		 * while loop is always just a boolean (or something that can be evaluated to a boolean)
		 */
		
		int x=1;
		do {
			System.out.println("Hello");
			x++;
		} while (x<3);
		/*
		 * this will only print hello 2 times, because it checks the condition AFTER running the code inside the loop 
		 * and the code inside the loop will print Hello and increases x to 2 in the 1st iteration, and then
		 * check the condition, 2 is less than 3,
		 * go back and print Hello again in the 2nd iteration, and THEN increase x to 3, which will be false
		*/ 
		
		/*
		 *when a condition is false BEFORE going into a code, do-while will print it at least once
		 *and then check the condition, but while loop will check the condition first, so it'll never print  
		 */
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		int a=0;
		for(System.out.println("1. a=" + a); a<3; System.out.println("3. a=" + a)) {
			System.out.println("PRINT");
			System.out.println("---------");
			a++;
		}
		/* for loops work like this:
		 * 1. Initialization
		 * 2. check condition
		 * 	EXECUTE
		 * 3. increment or decrement variable
		 * 2. check condition
		 * 	EXECUTE
		 * 3. increment or decrement variable
		 * 2. check condition
		 * 
		 * part 1 can be anything AS LONG AS THE CONDITON'S VARIABLE HAS ALREADY BEEN INITILIZED
		 * 
		 * part 3 can be anything; if it's not incrementing or decrementing the variable, then the variable must
		 * be incremented or decremented inside the block of code
		 * 
		 * whatever is in part 3 is executed every time the loop iterates STARTING FROM THE 2ND ITERATION
		 */
		
		
//		for(int q=0; q<2; q++) {
//			System.out.println("Message");
//			q--;
//		}
		/* will be an infinite loop, BECAUSE:::::
		 * q will start off at 0, then Execute decreasing q to -1,
		 * then increase q by 1 to be 0 again, 
		 * then EXECUTE & decrement
		 * then increment
		 * then Execute & decrement
		 * then increment
		 * then Execute & decrement
		 * on and on and on
		 */
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		for(int y=0; y<5; y++) {
			System.out.println("1");
			if(y<3) {
				continue;
			}
			System.out.println("2");
		}
		/* It will print 1 all 5 times.
		 * BUT it'll ONLY print the 2 the LAST 2 times, when y is GREATER THAN OR EQUAL TO 3.
		 * And loop prints as long as y is less than 5 for a total of 5 times.
		 */
		
		/*
		 * 
		 */
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		/*
		 * 
		 */
		
		
	}

}
