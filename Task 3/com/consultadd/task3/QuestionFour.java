/**
 * 
 */
package com.consultadd.task3;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionFour {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionFour qFour = new QuestionFour();
		qFour.sumOfNaturalNumber();
	}

	public void sumOfNaturalNumber() {
		
		System.out.println("\n4. Sum of Natural Numbers");
		
		System.out.println("Enter a natural number: ");
		int num = scanner.nextInt();
		int sum = 0;
		while(num>=0) {
			sum+=num;
			num--;
		}
		System.out.println("Sum is: " + sum);
	}
}
