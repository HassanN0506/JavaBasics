package com.syntax.class10;

public class N2_RetrievingElementsOf2dArrays {

	public static void main(String[] args) {
		
		/*
		 * to print out all the elements of a 2d array, make a nested for loop
		 * 
		 * Outer loop iterates the rows
		 * inner loop iterates the columns
		 */
		
		//example:
		int[][] num = {
				{1,2,3,4},
				{10,20,30},
				{100,200},
				{1000},
				{5}
				};
		
		int size=num.length;
		System.out.println(size);
		//the LENGTH (arrayName.length) of this 2d array is "5", because it has 5 ROWS!!!!!!!!!AKA 5 1D arrays!!!!!!!!!
		
		
		//TO FIND THE "LENGTH" OF A SPECIFIC ARRAY/ROW IN A 2D ARRAY, SPECIFY IT'S INDEX:
		int row1 = num[0].length; //num[0] is the INDEX of the 1st row
		System.out.println(row1);
		//Remember, a 2d array can have varying # of elements in each row
		
		int row4 = num[3].length; //[3] 4th row
		System.out.println(row4); //1 elements
		
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		//retrieving all elements from 2d array:
		
		for(int i=0; i<num.length; i++){ //rows
			
			for(int j=0; j<num[i].length; j++){ //columns
				
				System.out.print(num[i][j]+" ");
				
			} System.out.println();
		}
		
		
		/*
		 * if you created your 2d array the long way, and you left 1 element's value blank
		 * example:	" numbers[1][1]; "
		 * 
		 * then, when printing the entire 2d array,
		 *  java will print out the default value of the data type of that element.
		 */
		
		
	}

}
