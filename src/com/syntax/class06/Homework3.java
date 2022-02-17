package com.syntax.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		/*
		 * Write a program to ask user to enter value for sale: yes or no
		 * if there is no sale --> you are not going for shopping
		 * if there is sale ask you user for the price of the item
		 * 		
		 * Based on the price you have to calculate the price of the item after the discount
		 * 		
		 * if price is less than $20 --> apply 10% discount
		 * if price is between $20 & $100 --> 20% discount
		 * if price between $100 & $500 --> 30% discount
		 * otherwise apply 50% discount
		 * 
		 * Output of the program should be:
		 * After discount ___ the price of the item reduce from __ to ___
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Is there a sale?");
		String sale = sc.nextLine();
		
		if(sale.equalsIgnoreCase("no")) {
			System.out.println("You are not going shopping");
			
		} else if(sale.equalsIgnoreCase("yes"))
		{
			System.out.println("What is the price of the item?");
			double price = sc.nextDouble();
			
			double discPrice;
			
			if(price>0.0 && price<20.00) {
				discPrice = price-(price*0.1);
				System.out.println("After a 10% dicsount, the price of the item is reduced from "+price+" to "+discPrice);
				
			} else if(price>=20.00 && price <=100.00) {
				discPrice = price-(price*0.2);
				System.out.println("After a 20% dicsount, the price of the item is reduced from "+price+" to "+discPrice);
				
			} else if(price>=100.00 && price <=500.00) {
				discPrice = price-(price*0.3);
				System.out.println("After a 30% dicsount, the price of the item is reduced from "+price+" to "+discPrice);
				
			} else if (price>500.00){
				discPrice = price-(price*0.5);
				System.out.println("After a 50% dicsount, the price of the item is reduced from "+price+" to "+discPrice);
				
			} else if (price == 0.0){
				System.out.println("The item is free!");
				
			} else {
				System.out.println("ERROR: the price of the item must be a positive numerical value");
			}
			
		} else {
			System.out.println("ERROR: please input 'yes' or 'no'");
		}
	}

}
