/**
 * 
 */
package com.consultadd.task2;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionEight {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionEight qEight = new QuestionEight();
		qEight.positiveNegative();
	}

	public void positiveNegative() {
		
		System.out.println("\n8. Positive Negative!");
		
		System.out.println("Enter a number (Decimal): ");
		float num = scanner.nextFloat();
		
		if (num==0) {
			System.out.println("zero");
		} else if (num<0) {
			System.out.println("negative");
		} else if(num>0) {
			System.out.println("positive");
		}
		if(Math.abs(num)<1) System.out.println("small");
		if(Math.abs(num)>1000000) System.out.println("large");
		
	}
}
