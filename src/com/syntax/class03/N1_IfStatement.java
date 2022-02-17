package com.syntax.class03;

public class N1_IfStatement {
	
	public static void main(String[] args) {
		
		/*
		 * Scenario: I need to compare 2 numbers find which one is bigger.
		 */
		
		int num1=100;
		int num2=50;
		
		if (num1>num2) { 	
			System.out.println(num1+" is larger than "+num2);
		} //everything inside this {} block will be ignored if the condition is FALSE
		
		
		double money=5;
		double coffee=5;
		//if i have MORE money than the price of the coffee, then i am buying coffee
		if (money>coffee) {
			System.out.println("I am buying the coffee");
		} 
		//'coffee' is not GREATER than 'money', so everything inside this {} is going to be ignored
		
		
		/* if(MUST BE A BOOLEAN VALUE IN HERE)
		 * if(money=coffee) will be ERROR, because it is not a boolean. '=' is an Assignment operator.
		 * if(money==coffee) will work. '==' is a Relational operator. It is a boolean (true/false).
		 */
		
		if (money>=coffee) {
			System.out.println("I am buying the coffee");
		} //it prints, because the condition is True. 'money' is greater than or equal to 'coffee' (it is equal).
		
	}
}
	
