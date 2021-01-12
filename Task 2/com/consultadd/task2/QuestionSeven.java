/**
 * 
 */
package com.consultadd.task2;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionSeven {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionSeven qSeven = new QuestionSeven();
		qSeven.conditionalActions();
	}

	public void conditionalActions() {
		
		System.out.println("\n7. Conditional Actions!");
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		if((num%2==1) || (num%2==0 && num>=6 && num<=30)) {
			System.out.println("NEW");
		}
		if ((num%2==0 && num>=2 && num<=5) || (num%2==0 && num>30)) {
			System.out.println("OLD");
		}
	}
}
