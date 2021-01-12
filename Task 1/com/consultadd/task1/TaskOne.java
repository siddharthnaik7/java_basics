/**
 * 
 */
package com.consultadd.task1;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class TaskOne {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TaskOne tOne = new TaskOne();
		
		// Q1
		//tOne.swapOne();
		//tOne.swapTwo();
		
		// Q2
		//tOne.userInput();
		
		// Q3
		//tOne.additionMethod();
	}
	
	public void swapOne() {
		int a = 10;
		int b = 20;
		
		System.out.println("1. Swapping with the help of a temporary variable");
		System.out.println("Values of a and b are: " + a + " & " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping Values of a and b are: " + a + " & " + b);
	}

	public void swapTwo() {
		int a = 30;
		int b = 50;
		
		System.out.println("\n2. Swapping without temporary variable");
		System.out.println("Values of a and b are: " + a + " & " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping Values of a and b are: " + a + " & " + b);
	}
	
	public void userInput() {
		System.out.println("\n3. Displaying the value entered by the user");
		System.out.println("Enter a Number (Integer): ");
		int temp = scanner.nextInt();
		System.out.println("The entered number is: " + temp);
	}
	
	public void additionMethod() {
		System.out.println("\n4. Add two user entered numbers and then add 30");
		System.out.println("Please enter 2 numbers between 1-10: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("The entered numbers are " + a + " & " + b);
		int z = a+b;
		z+=30;
		System.out.println("Total addition is: " + z);
	}

}
