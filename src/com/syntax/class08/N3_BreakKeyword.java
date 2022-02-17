package com.syntax.class08;

public class N3_BreakKeyword {

	public static void main(String[] args) {

		for(int i=1; i<5; i++) {
			System.out.println("I am inside the For loop");
			System.out.println("i is now "+i);
			
			if (i==3) {
			System.out.println("I will now break out of this For loop");	
			break;//GET OUT OF THIS CURRENT BLOCK (for loop block)
			}
		}
		System.out.println("I am now OUTSIDE of the loop");
		
		System.out.println("------------------------------------------------------------");
		
		boolean winter=true;
		int temp=0;
		
		while(winter) {
			
			System.out.println("It's cold");
			System.out.println("The tempreture is "+temp);
			temp +=5;
			
			if(temp>45)
			break;
		}
		
		
	}

}
