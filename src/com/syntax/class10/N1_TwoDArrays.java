package com.syntax.class10;

public class N1_TwoDArrays {

	public static void main(String[] args) {
		
		/*
		 * arrays can be multi-dimensional
		 * 
		 * a 2d array is an array of arrays
		 * combination of rows and columns
		 * 
		 * arrays are a special container; they store elements based on indexes
		 * 
		 * Declaring a 2d array:	int[][] bigArray = new int[# of rows][# of columns]
		 */
		
		
		int [][] numbers = new int[3][4];
		//3 rows and 4 columns AKA 3 1d arrays, each with 4 elements
		
		//row 1 AKA the 1st 1d array
		//[][] refers to the indexes
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		//row 1, done.
		//notice how the row number index is all the same

		//2nd row
		//row index is now 1
		numbers[1][0]=100;
		numbers[1][1]=200;
		numbers[1][2]=300;
		numbers[1][3]=400;
		
		//3rd row
		//row index is now 2
		numbers[2][0]=1000;
		numbers[2][1]=2000;
		numbers[2][2]=3000;
		numbers[2][3]=4000;
		
		//i want to print 200
		System.out.println(numbers[1][1]);
		
		//i want to know the value of the 1st row, 3rd column
		System.out.println(numbers[0][2]);
		/*
		 * the index # is ALWAYS the row or column #, minus 1 !!!
		 * (bc in coding, indexes always start w/ zero)
		 * so 1st row's index is 0, and the 3rd column's index is 2
		 */
		
		System.out.println("---------------------------------------------------------------------------------");
		
		//shorter way to make a 2d array:
		int[][] nums = {{1,2,3,4},{10,20,30,40},{100,200,300,400},{1000,2000,3000,4000}};
		//i have 4 1d arrays, each with 4 elements 
		//(they don't always have to have the same amount of elements)!!!!!!!!!!!!!!!!
		//but they must be the same data type!!!!!!!!!!!!!!!!
		
		//i want to print 20:
		System.out.println(nums[1][1]);
		//	IMAGINE EACH 1D ARRAY IS IN A ROW UNDER THE PREVIOUS ARRAY!!!!!!!!!!!!!!!!
		
		//what is the value of the element at index nums[3][1]?
		System.out.println(nums[3][1]);
		
		System.out.println("----------------------------------------------------------------------------------");
		
		//another
		int[][] n={{1,2,3},{11,12,13,14,15,16},{22,23,24,25},{99,97,95}};
		//notice how it's a 2d array made up of different sized 1d arrays
		
		//i want 97
		System.out.println(n[3][1]);
		
		//	i want 14
		System.out.println(n[1][3]);
		//2nd row, 4th column
		
		
	}

}
