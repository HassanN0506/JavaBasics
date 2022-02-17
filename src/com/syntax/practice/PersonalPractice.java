package com.syntax.practice;

//import java.util.Scanner;

public class PersonalPractice {

	public static void main(String[] args) {
		
		
	      int array[] = {10, 20, 25, 63, 96, 57};

	      for(int i = 0; i<array.length; i++ ){
	         
	    	  for(int j = i+1; j<array.length; j++){

	            if(array[i]>array[j]){
	              
	            	int temp = array[i];
	            	
	            	array[i] = array[j];
	            	
	            	array[j] = temp;
	            }
	         }
	      }
	      
	   
		
	}
}
