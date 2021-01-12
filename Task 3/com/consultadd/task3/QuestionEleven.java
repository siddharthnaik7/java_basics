/**
 * 
 */
package com.consultadd.task3;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionEleven {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionEleven qEleven = new QuestionEleven();
		qEleven.numberComparision();
	}

	public void numberComparision() {
		
		System.out.println("Enter 2 decimal numbers upto 2 decimal values: ");
		 float num1 = scanner.nextFloat();
		 float num2 = scanner.nextFloat();
		 
		 if(Math.abs(num1-num2)==0.00) {
			 System.out.println("The 2 numbers are same!");
		 } else {
			 System.out.println("The 2 numbers are not same!");
		 }
	}
}
