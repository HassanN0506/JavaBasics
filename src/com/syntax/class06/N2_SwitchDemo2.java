package com.syntax.class06;

public class N2_SwitchDemo2 {

	public static void main(String[] args) {
		
		char choice = 'a'; 	//yes, no, maybe --> y,n,m
		String answer;
		
		switch (choice) {
		
		default:
			answer="Unknown";
			break;
			/* !!!!!!!!!!!!!!!!!!!!!!!!!!
			 
			you NEED to put a " break; " at the end of every case 
			because if there is no break, java will go on to the next line, 
			and read "	Case 'y':	", 
			and that is not the value of 'choice',
			
			so then it'll go into the NEXT line of code (as it's SUPPOSED to)
			
			which is "	answer = "Yes"	" , 
			and change answer to YES 
			and THEN it'll read " break; " in the next line, and break out of the switch statement
			
			java always executes top down, so if the BREAKs are missing, it'll just go on line by line
			and change the answer over again
			!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
			
		case 'y':
			answer="Yes";
			break;
		case 'n':
			answer="No";
			break;
		case 'm':
			answer="Maybe";
		//you don't need to put " break; " at the end, because in the next line it'll already get out.
 
		}
		
		System.out.println(answer);
		
		
		System.out.println("-----------------------");
		
		
		/*
		 * declare a variable to store a car
		 * based on the value of the car define the country of origin
		 */
		
		String car="Lada";
		
		String country;
		
		switch(car.toLowerCase()) { 	
		/*
		 * " .toLowerCase() or .toUpperCase() 
		 *  will change the value of the variable ( 'car' ) to all lowercase letters (or all uppercase)
		 *  and then run it through the switch statement, in which i have specified the car names IN LOWERCASE
		 *  
		 *  this is a way to circumvent the capitalization of the input value, 
		 *  because switch case CANNOT do .ignoreCase()
		 *  
		 *  ONLY WORKS ON STRING, NOT ON CHAR
		 */
		
		case "bmw":
			country="Germany";
			break;
			
		case "ford":
			country="USA";
			break;
			
		case "lada":
			country="Russia";
			break;
			
		case "toyota":
			country="Japan";
			break;
			
		default:
			country="Unknown";
		}
		
		System.out.println(car+" is from "+country);
		
	}

}
