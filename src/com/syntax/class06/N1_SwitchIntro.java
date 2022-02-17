package com.syntax.class06;

public class N1_SwitchIntro {

	public static void main(String[] args) {

		int day = 5;
		
		//the DEFAULT value of all non-primitive data types (such as String) is 'null' 
		String dayName = null;

		if (day==1) {
			dayName = "Monday";
			
		} else if (day==2) {
			dayName = "Tuesday";
			
		} else if (day ==3) {
			dayName = "Wednesday";
			
		} else if (day == 4) {
			dayName = "Thursday";
			
		} else if (day == 5) {
			dayName = "Friday";
			
		} else if (day == 6) {
			dayName = "Saturday";
			
		} else if (day == 7) {
			dayName = "Sunday";
		
		}else { // ELSE is always is the last
			dayName = "Invalid";
		} //we can just add an Else at the end of our If statement if we don't want to resort to the DEFAULT value in case it's all false
		
		System.out.println(dayName);
		
		
		System.out.println("-------------------------------------------------------------------------");
		///////////////////////////////////////////////////////////////////////////////////////////////
		//do the same thing in SWITCH
		
		switch (day) {
		
		case 1:
			dayName="Monday";
			break;
		
		case 2:
			dayName="Tuesday";
			break;
		
		case 3:
			dayName="Wednesday";
			break;
			
		case 4:
			dayName="Thursday";
			break;
			
		case 5: 
			dayName="Friday";
			break;
			
		case 6:
			dayName="Saturday";
			break;
			
		case 7:
			dayName="Sunday";
			break;
			
		default:// ELSE in an if-else must always be last, but DEFAULT can be anywhere
			dayName="Invalid";
			break;
		}
		
		System.out.println(dayName);
		
	}

}
