/**
 * 
 */
package com.consultadd.task1;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionTwo {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionTwo qTwo = new QuestionTwo();
		qTwo.userInput();
	}

	public void userInput() {
		System.out.println("\n2. Displaying the value entered by the user");
		System.out.println("Enter a Number (Integer): ");
		int temp = scanner.nextInt();
		System.out.println("The entered number is: " + temp);
	}
}
