package com.syntax.class09;

public class N4_ForEachLoop {

	public static void main(String[] args) {
		
		//if you have an array, you can use for-each loop to iterate/loop thru the entire array
		/*syntax:
		 *  for(dataType pickName : nameOfArray){
		 *  	System.out.println(pickName);
		 *  	}
		 */
		
		String[] cities= {"Washington DC", "Miami", "Denver", "Chicago"};
		
		for(String city:cities) {
			System.out.println(city);
		}
		//each element is individually stored in the String 'city' with each iteration, in order of index
		
		System.out.println("-----------------------------------------------------------------");
		
		//another example:
		int[] numbers= {10, 20, 30, 40, 50};
		
		for(int i:numbers) {
			System.out.println(i);
		}
		/* each element of array 'numbers' is INDIVIDUALLY stored 
		 * in integer 'i' with each iteration, in order of the array's index,
		 * and is then being printed out 
		 */ 
		
		System.out.println("------------------------------------------------------------------");
		
		//another
		char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(char a:grade) {
			System.out.print(a+"  ");
		
		}System.out.println();
		
		//left side of  :  is always the same data type as the elements in the array
		//we're creating a new variable to copy each element's value, and then print that value in each iteration
		//Right side of  :  is always the array name
		
		System.out.println("------------------------------------------------------------------");

		//another
		String[] countries = {"USA", "Mexico", "Russia", "China", "Iran"};
		
		for(String country:countries) {
			System.out.println(country);
		}
		
	}

}
