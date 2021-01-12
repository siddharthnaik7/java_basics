/**
 * 
 */
package com.consultadd.task2;

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
		qFive.divisibleAndMultiple();
	}

	public void divisibleAndMultiple() {
		
		System.out.println("\n5. Divisible and Multiple!");
		
		int num1 = 2000;
		int num2 = 3200;
		
		for(int i=num1; i<=num2; i++) {
			if(i%7==0 && i%5!=0) System.out.println(i);
		}
	}
}
