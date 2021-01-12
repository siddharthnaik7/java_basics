/**
 * 
 */
package com.consultadd.task3;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionSix {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionSix qSix = new QuestionSix();
		qSix.increasingDecreasing();
	}

	public void increasingDecreasing() {
		
		System.out.println("\n6. Increasing Decreasing Numbers");
		
		System.out.println("Enter Three Numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1<num2 && num2<num3) {
			System.out.println("Increasing");
		} else if(num1>num2 && num2>num3) {
			System.out.println("Decreasing");
		} else {
			System.out.println("Neither increasing or decreasing order");
		}
	}
}
