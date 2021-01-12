/**
 * 
 */
package com.consultadd.task1;

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
		qOne.swapOne();
		qOne.swapTwo();
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
}
