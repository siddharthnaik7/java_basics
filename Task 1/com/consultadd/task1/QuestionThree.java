/**
 * 
 */
package com.consultadd.task1;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionThree {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionThree qThree = new QuestionThree();
		qThree.additionMethod();
	}

	public void additionMethod() {
		System.out.println("\n3. Add two user entered numbers and then add 30");
		System.out.println("Please enter 2 numbers between 1-10: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("The entered numbers are " + a + " & " + b);
		int z = a+b;
		z+=30;
		System.out.println("Total addition is: " + z);
	}
}
