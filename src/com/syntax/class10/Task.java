package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		
		//create an array and retrieve all elements in reverse order 
		
		int[] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		for(int i=(numbers.length - 1); i>=0; i--) {
			System.out.print(numbers[i]+" ");
		}
		
	}

}
