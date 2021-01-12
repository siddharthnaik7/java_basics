/**
 * 
 */
package com.consultadd.task2;

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
		qFour.breakAndContinue();
	}

	public void breakAndContinue() {
		
		System.out.println("\n4. Break and Continue!");
		
		int num = 0;
		
		while(true) {
			System.out.println("Enter a number: ");
			num = scanner.nextInt();
			
			if(num>0) {
				System.out.println("Good Going");
			} else break;
			
		}
		System.out.println("It's Over");
	}
}
