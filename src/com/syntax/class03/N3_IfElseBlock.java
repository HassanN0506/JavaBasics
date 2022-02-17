package com.syntax.class03;

public class N3_IfElseBlock {
	
	public static void main(String[] args) {
		
		int num1=100;
		int num2=50;
		
		//which number is largest?
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		} else {
			System.out.println(num2+" is larger than "+num1);
		}
			
		
		int num3=20;
		int num4=200;
		if(num3>num4) {
			System.out.println(num3+" is larger than "+num4);
		}else {
			System.out.println(num4+" is larger than "+num3);
		}
		
		
		int temp=45;
		//if temp is 45 or higher, I am going for a walk. Otherwise, I'll stay at home.
		if (temp<45) {
			System.out.println("I am going for a walk.");
		} else {
			System.out.println("I am staying at home.");
		}
		
		
		/* I need a variable that store a gender
		 * if gender is female, please use the front of the train
		 * otherwise, please use the back of the train 
		 */
		char gender='F';
		if(gender=='F') {
			System.out.println("Please use the front of the train.");
		} else {
			System.out.println("Please use the back of the train.");
		}
		//the condition is True(gender is indeed female), so it executes the 'If' code.
		
		//lets change the Char gender to male
		gender='M';
		//and run the same If Else statement 
		if(gender=='F') {
			System.out.println("Please use the front of the train.");
		} else {
			System.out.println("Please use the back of the train.");
		}
		//now, the condition is False(M is not F), so it executes the 'Else' code.
		
		
		
		
	}

}
