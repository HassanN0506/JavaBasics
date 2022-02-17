package com.syntax.class03;

public class N9_ShorthandOperators {

	public static void main(String[] args) {
		
		//+, -, *, /, %
		
		int num=100;
		num=num+100;	
		System.out.println(num);
		
		num+=100; //this exact means this --> num=num+100;
		System.out.println(num);
		
		num-=20; //this exact means this --> num=num-20;
		System.out.println(num);
		
		num/=10; //this exact means this --> num=num/10;
		System.out.println(num);
		
		num*=3; //this exact means this --> num=num*3;
		System.out.println(num);
		
		num%=5; //this exact means this --> num=num%5;
		System.out.println(num);
	}

}
