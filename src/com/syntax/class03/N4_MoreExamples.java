package com.syntax.class03;

public class N4_MoreExamples {
	public static void main(String[] args) {
		
		/*we need to declare a boolean variable hungry yes or no
		 * if we are hungry, i am going to eat
		 * otherwise, i am going to drink a tea
		 */
		
		boolean hungry=false;
		if (hungry==true) //Remember, == not = .  If i said "hungry=true", it would change the hungry BOOLEAN VALUE to True.
		{ 
			System.out.println("I am going to eat.");
		} else {
			System.out.println("I am going to drink a tea");
		}
		/*or, since 'hungry' is already is a boolean, there is no need for a relational operator,
		 * just put the boolean name in the if else statement. if('boolean name') {}.....
		 */
		
		//Example:
		boolean traffic=false;
		if(traffic) //since traffic is already is a boolean(true or false), i can just write "traffic" in here.
		{
			System.out.println("I am getting home late.");
		} else {
			System.out.println("I am getting home on time.");
		}
		
		/* a Relational operator's  job in a IfElse statement is to come up with a True or False,
		 * but since boolean is already true or false, there is no need for relational operator.
		 */
		
		
		/* For STRINGS!!!!
		 * define a variable to store a browser
		 * if browser is Chrome, we are executing tests on Chrome.
		 * otherwise, browser is not supported for our test.
		 */
		String browser="Chrome";
		if(browser.equals("Chrome")) // " .equals() " is same as " == ", but with Strings, ALWAYS use " .equals() " 
		{
			System.out.println("We are executing tests on Chrome");
		} else {
			System.out.println("We are not executing any test cases");
		}
		//you cannot say if(browser) because 'browser' is not a boolean, it is a string. ERROR: Type Mismatch.
		//with Strings, ALWAYS use " if( .equals()) "!!!!
		
		
		
	}

}
