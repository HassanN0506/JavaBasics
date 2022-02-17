package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		
		//print even number 1 - 30
		
		int a = 2;
		
		while(a<=30) {
			System.out.print(a+" ");
			a+=2;
		} System.out.println();
		
		
		System.out.println("ANOTHER WAY");
		
		
		int b = 1;
		
		while(b <= 30) {
			if(b%2==0) {
				System.out.print(b + " ");
			}
			b++;
		} System.out.println();
		
		
		//Print numbers from 1 to 100 in 1 line with space
		System.out.println("----------task 2--------------");
		
		int c = 1;
		while(c<=100) {
			System.out.print(c+" ");
			c++;
		} System.out.println();
		
		
		//Print numbers from 100 to 1
		System.out.println("----------task 3--------------");
		int d = 100;
		while (d>=1) {
			System.out.print(d+" ");
			d--;
		}System.out.println();
		
		
		//Print even numbers from 20 to 100 
		System.out.println("----------task 4--------------");
		int e = 20;
		while (e<=100) {
			System.out.print(e + " ");
			e+=2;
		}System.out.println();
		
		
		//Print only odd numbers from 100 to 1
		System.out.println("----------task 5--------------");
		int f = 99;
		while (f>=1) {
			System.out.print(f+" ");
			f-=2;
		}System.out.println();
		
		
		//
		
	}

}
