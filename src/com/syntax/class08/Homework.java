package com.syntax.class08;

public class Homework {

	public static void main(String[] args) {
		
		//make a clock. You can pick 12 or 24 hour clock.
		//12 hour clock
		
		for(int hour=1; hour<=12; hour++) {
			for(int minute=0; minute<=59; minute++) {
				if(minute<10) {
					System.out.println(hour+":0"+minute);
				} else {
					System.out.println(hour+":"+minute);
				}
			}
		}
		
		System.out.println("*************************");
		
		for (int h1=0; h1 <=2; h1++) {
			for (int h2=0; h2<=9; h2++) {
				
				if(h1==2 && h2==4) {
					break;
				}
				
				for (int m1=0; m1<=5; m1++) {
					for (int m2=0; m2<=9; m2++) {
					
						System.out.println(""+h1+h2+":"+m1+m2);
						//an empty "" is so that it will CONCATINATE instead of adding
					}
				}
			}
		}
	}

}
