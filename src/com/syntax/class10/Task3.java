package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * create a 2d array where you will store Mr, Mrs, Ms, Miss
		 * and Smith, Jordan, Jackson, Obama
		 * 
		 * after storing values, print the string:
		 * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan
		 */
		
		String[][] names= {{"Mr.","Mrs.","Ms.","Miss"},{"Smith","Jordan","Jackson","Obama"}};
		System.out.println(names[0][1]+" "+names[1][0]);//mrs smith
		System.out.println(names[0][0]+" "+names[1][3]);//mr obama
		System.out.println(names[0][2]+" "+names[1][2]);//ms jackson
		System.out.println(names[0][3]+" "+names[1][1]);//miss jordan
	
		
		
		System.out.println("-----------------------------------------------");
		/*
		 * Create a 2D array in which first array will consist of 4 names 
		 * and second array will contain grades. 
		 * Then your program should print name of the students that has A and B grade
		 */
		
		String[][] nameGrades={{"Hassan","John","Jack","Emily"},{"A","B"}};
		
		System.out.println(nameGrades[0][0]+"'s grade: "+nameGrades[1][0]);
		System.out.println(nameGrades[0][1]+"'s grade: "+nameGrades[1][1]);
		
	}

}
