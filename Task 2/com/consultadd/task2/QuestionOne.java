/**
 * 
 */
package com.consultadd.task2;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionOne {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionOne qOne = new QuestionOne();
		qOne.printIfDivisible();
	}

	public void printIfDivisible() {
		
		System.out.println("1. Print if Divisible!");
		
		System.out.println("Enter a number (Integer): ");
		int num = scanner.nextInt();
		System.out.println("The entered number is: " + num);
		if(num%3==0) {
			System.out.println("Consultadd");
		} else if(num%5==0) {
			System.out.println("JAVA TRAINING");
		} else if(num%3==0 && num%5==0) {
			System.out.println("Consultadd JAVA Training");
		} else System.out.println("Out of Scope");
	}
}
