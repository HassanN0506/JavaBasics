package com.syntax.class07;

public class N2_IncrementAndDecrement {

	public static void main(String[] args) {
		
		int num = 10;
		
		num = num+1;
		
		num+=1;
		
		num++;
		
		System.out.println(num);//13
		//increment operator add 1 to a variable
		
		num++;
		System.out.println(num);
		//10++; Compilation Error: invalid argument to operation ++/--
		
		
		//decrement operator subtract 1 from variable
		
		num--;
		num--;
		num--;
		System.out.println(num);//11
		
		
		
		
	}

}
