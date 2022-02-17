package com.syntax.class09;

public class Homework {

	public static void main(String[] args) {
		
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		
		String[] cars = new String[6];
		cars[0] = "Ford";
		cars[1] = "BMW";
		cars[2] = "Mercedes";
		cars[3] = "Nissan";
		cars[4] = "Lamborgini";
		cars[5] = "VW";
		
		for(String j:cars) {
			System.out.println(j);
		}
		
		System.out.println("----------------Way #2-----------------");
		
		for (int a=0; a<cars.length; a++) {
			System.out.println(cars[a]);
		}
		
		
		
		System.out.println("******************TASK 2********************");
		/*
		 * Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		
		 String[] animals = {"Giraffe", "Elephant", "Lion", "Alligator", "Horse"};
		 
		 int b=0;
		 do {
			 System.out.println(animals[b]);
			 b++;
		 } while (b<animals.length);
		 
		System.out.println("----------------Way #2-----------------");
		
		for (String k:animals) {
			System.out.println(k);
		}
		
		
		
		System.out.println("******************TASK 3********************");
		 //Create an array of integers and calculate the sum of all elements in the array
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -12};
		
		int sum=0;
		
		for(int x:numbers) {
			sum += x;
		}
		System.out.println(sum);
		
		
		
		System.out.println("******************TASK 4********************");
		 //From an array of integer elements find the largest number
		
		int[] nums= {57, 43, 22, 36, 111};
		
		int largest=0;
		
		for(int s:nums) {
			
			if(s>largest) {
				largest=s;
			}
		}
		
		System.out.println(largest);
		
		
	}

}
