package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * create an array of countries
		 * retrieve all elements from that array
		 * While retrieving all values from that array
		 * also print the capitol of each country
		 */
		
		String[] countries = {"USA", "Mexico", "China", "France"};
		
		for (String country:countries) {
				
				String capitol=null;
						
				switch (country) {
					case "USA":
						capitol = "Washington DC";
						break;
						
					case "Mexico":
						capitol = "Mexico City";
						break;
				
					case "China":
						capitol = "Hong Kong";
						break;
					
					case "France":
						capitol = "Paris";
				}
				
				System.out.println(capitol+" is the capitol of "+country);
		}
		
		
	}
}




 			
		

