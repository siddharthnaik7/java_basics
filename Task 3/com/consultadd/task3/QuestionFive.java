/**
 * 
 */
package com.consultadd.task3;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionFive {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuestionFive qFive = new QuestionFive();
		qFive.longInput();
	}

	public void longInput() {
		
		System.out.println("\n5. Long Numbers");
		
		System.out.println("Enter a long integer: ");
		long num = scanner.nextLong();
		String str = Long.toString(num);
		int len = str.length();
		System.out.println("Number of digits in input number is: " + len);
		int sum=0;
		for(int i=0;i<len;i++) {
			sum+= Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		System.out.println("Sum of number is: "+ sum);
	}
}
