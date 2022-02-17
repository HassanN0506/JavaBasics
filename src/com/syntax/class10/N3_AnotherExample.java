package com.syntax.class10;

public class N3_AnotherExample {

	public static void main(String[] args) {

		String[][] food= {
				{"banana", "apple", "grape", "peach"},
				{"burger", "fries", "soda"},
				{"curry", "rice", "roti"},
				{"chips", "cookies", "candy", "energy drink"}
		};
		
		for(int row=0; row<food.length; row++) {	
			
			for(int column=0; column<food[row].length; column++) {
				System.out.print(food[row][column]+" ");
				
			}System.out.println();
		}
		
	}

}

