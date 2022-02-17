package com.syntax.class08;

public class N5_NestedLoopPattern {

	public static void main(String[] args) {

		for(int a=5; a>=1; a--){ //rows
			for(int b=1; b<=a; b++){  //columns
				System.out.print(b+" ");
			 }
			 System.out.println();//next line after each iteration of the nested loop
		}
		
		for(int a=1; a<=5; a++){ //starting from 2, and going the other way now
			for(int b=1; b<=a; b++){  
				System.out.print(b+" ");
			 }
			 System.out.println();
		}	 
		
	}
}

