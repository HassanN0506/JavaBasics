package com.syntax.class05;

import java.util.Scanner;

public class N1_NextVsNextLine {

	public static void main(String[] args) {
		
		//	next(); vs nextLine();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter tempreture");
		
		//if you FIRST put:
		int temp = scan.nextInt(); //or next(); nextDouble(); nextBoolean(); next().charAt(0); 
		System.out.println(temp);
		//the scanner's input reader cursor is currently sitting at the end of whatever value you put in

		scan.nextLine(); 
		/*!!!!!!!!!!!!!!! unless you put THIS in !!!!!!!!!!!!!!!!!!!!!
		 * as a "spacer"
		 * (so that the scanner's input reader cursor will know to move on to the next line of input)
		 */
		
		System.out.println("Please enter City");
		
		String city = scan.nextLine(); //it will not then capture THIS nextLine(); of input 
		System.out.println(city);

		System.out.println("End of program");
		
		/*
		 * Because next(); only reads the input until a space is hit
		 * and it leaves the cursor at the end of THAT line, after the space
		 * and so the following input will not be read 
		 * (and it might not even give you a chance to put anything in it, if there's only 2 inputs)
		 * unless it happens to be in the same line of input, after a space (which it won't be bc we hit Enter)
		 * 
		 * Whereas nextLine(); reads the entire line (including spaces), AND it moves the cursor to the next line
		 * 
		 * So, sometimes, it's important to have a "spacer" nextLine(); 
		 * just so the scanner cursor will move to the next line and continue to read input from there.
		 */
		
		//only when you want to capture a String right after one of the other ones!!!!!!!!!!!!!!!!!!
		
		//!!!!!!!!!!!!!it reads the 'enter' you hit as the input!!!!!!!!!!!!!!!!!!!!!!!!
		
		/*
		 * if you have a System.out.println() AFTER a next(), 
		 * the syso will move the cursor to the end of it's line of output automatically.
		 * 
		 * so, if your trying to capture a string WITHOUT spaces,
		 * just use next()
		 * but remember to always put a scannername.nextLine(); before capturing the next input
		 * IF YOU DONT HAVE A SYSO IN BETWEEN THE TWO
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		System.out.println(num);
		System.out.println("Enter full name");
		sc.nextLine(); //if you comment out this line, you'll get THAT damned error
		/*
		 * the enter you hit gets stored in this variable
		 * so you can either create a new scanner and use THAT to capture this input string
		 * OR an easier way is to put ANOTHER sc.nextLine() here
		 * and that way, the enter will be captures in the 1st sc.nextLine()
		 * and the actual input string will be stored in sc.nextLine()
		 * 
		 * just remember, the FIRST one stores the enter 
		 * the SECOND one actually stored the input string
		 * so you must declare (name) the SECOND variable in order to use it in your code.
		 */
		String fullName=sc.nextLine();
		System.out.println(fullName);
		System.out.println("End");
	}

}
