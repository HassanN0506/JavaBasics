package com.syntax.class06;

public class N3_SwitchLimitations {

	public static void main(String[] args) {
		
		/* 
		 * DATA TYPE LIMITATIONS IN SWITCH STATEMENTS:
		 
		 * String, byte, short, int, and char all work in switch statements 
		
		 * switch cannot work with Boolean, double, float, or long (only work with int, char, and string)
		 * (only Int and numbers CASTED as int values)(technically chars are stored as int values BTS)
		 * bc boolean is only 1 of 2 values, so if else is better
		 * and the rest would not be reliable comparisons 
		 * because they are too long and have too many possibilities 
		 */
	
		
		/*	
		 * OPERATOR LIMITATIONS IN SWITCH STATEMENTS
		 *  we can NOT put RELATIONAL OR LOGICAL operators in switch statements (for one of the cases)
		 *  
		 *  ex:
		 *  switch(blahblah){
		 *  	case (num1 >= 10):		
		 *  		blahblah; 
		 *  		break;
		 *  }
		 *  !!!!!!!!RELATIONAL OPRATORS!!!!!!!! WILL NOT WORK, we must specify exact values 
		 */
		
		
		/*
		 * you CANNOT have 2 Duplicate cases
		 * every case must be UNIQUE
		 * or else java will return ERROR, because it does not know which of the 2 cases to execute
		 * 
		 * ex:
		 *  switch(whatever){
		 *  
		 *  	case (ABC):		
		 *  		blahblah; 
		 *  		break;
		 *  
		 *  	case (ABC):			same as the first case
		 *  		yaddayadda; 
		 *  		break;
		 *  }
		 */
		
		
		/*
		 * every case data TYPE within 1 switch statement must be the same (obviously)
		 */
		
	}
	
}
