package com.syntax.class05;

public class N6_LogicalNot {

	public static void main(String[] args) {
		
		//Logical not is used to REVERT the condition
		
		boolean value = !true ;
		
		System.out.println(value); //false (NOT true)
		
		System.out.println("----------------------------------------------------------------------------------");
		
		
		boolean traffic = true ;
				
		if (!traffic) { //if there is NO traffic
			System.out.println("I will be at work on time");
		} else {
			System.out.println("I will be late");
		}

		System.out.println("----------------------------------------------------------------------------------");

		
		String day = "Sunday" ;
		
		if (!day.equals("Saturday")) { //if String day is NOT equal to Saturday
			System.out.println("Today is not Saturday");
		}
		
		System.out.println("----------------------------------------------------------------------------------");

		
		boolean checkboxChecked = false ; //the checkbox is not checked (already, by default)
		
		if(!checkboxChecked) { //only if the checkbox is not ALREADY checked (by default) 
			System.out.println("I will click on that checkbox");
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		
		
		String java = "easy"; //java is easy
		
		if (!java.equals("hard")) { //if java is NOT hard
			System.out.println("You are a genius");
		}	//no output if you put java as "hard"
	}

}
