package com.syntax.class08;

public class N6_ForLoopsPractive {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
		}
		
		
		System.out.println("                 MULTIPLICATION TABLE                  ");
		
		/* 
		 * 3*1=3
		 * 3*2=6
		 * 3*3=9
		 * all the way down to 10
		 */
		
		int num=7;
		for(int multiNum=1; multiNum<=10; multiNum++) {
			System.out.println(num+" * "+multiNum+" = "+(num*multiNum));
		}
		
		
		System.out.println(" -what is the output?- ");
		
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum+=i;
			System.out.print(sum+" ");
		} System.out.println();
		
		
		System.out.println(" -what is the output 2?- ");
		
		int value=1;
		for(int i=1; i<4; i++) {
			value*=i;
			System.out.print(value+" ");
		}System.out.println();
		
		
		System.out.println("  --TASK--  ");
		/*
		 * find the sum of all even and all odd numbers from the range 1-50
		 */
		
		int even=0;
		int odd=0;
		
		for(int i=1; i<=50; i++) {
			
			if(i%2 == 0) {
				even+=i;
				
			} else {
				odd+=i;
			}
		}
		System.out.println("Even: "+even);
		System.out.println("Odd: "+odd);
		
		
		
		
	}

}
