package com.syntax.class08;

public class N2_NestedLoops {

	public static void main(String[] args) {
			
		for (int i=1; i<=3; i++) {
			
			System.out.println("**I am Outer 'i' Loop #"+i+" **");
			
			for(int j=1; j<=2; j++) {
				System.out.println("I am Nested 'j' Loop #"+j);
			} //this 'Nested' loop will execute inside of every cycle of the 'Outer' loop
			//and WILL NOT execute unless the outer loop is executed
			
			System.out.println();//i did this just to make it easier to see in the console
		}
		
		
		System.out.println("------------------------------------------");
		
		for(int i=1; i<=4; i++) {
						
			for(int j=1; j<=3; j++) {
				System.out.println(j);
			}	
			
			System.out.println("^"+i);
			System.out.println();
		}
		
		
		System.out.println("------------------------------------------");
		
		for(int a=0; a<=9; a++) {
			for(int b=0; b<=9; b++) {
				for(int c=0; c<=9; c++) {
					System.out.println(a+""+b+""+c);
				}			
			}		
		}
		
		
		//
		
	}
}

	
