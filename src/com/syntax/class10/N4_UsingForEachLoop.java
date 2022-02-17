package com.syntax.class10;

public class N4_UsingForEachLoop {

	public static void main(String[] args) {
		
		//for-each loop AKA "Enhanced For Loop"
		
		String[][] food= {
				{"banana", "apple", "grape", "peach"},
				{"burger", "fries", "soda"},
				{"curry", "rice", "roti"},
				{"chips", "cookies", "candy", "energy drink"}
		};
		
		System.out.println("PRINT ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP");
		System.out.println();
		
		
		//outer loop iterates thru each array inside 2d array
		for(String[] cousine:food) {
			
			//inner loop iterates thru each element from selected array
			for(String f:cousine) {
				System.out.print(f+" ");
				
			}System.out.println();
		}
		
		
		
		
	}

}
