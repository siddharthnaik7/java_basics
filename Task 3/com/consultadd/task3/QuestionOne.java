/**
 * 
 */
package com.consultadd.task3;

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
		qOne.multiplication();
	}

	public void multiplication() {
		
		System.out.println("\n1. Number Multiplication");
		
		System.out.println("Enter the number for multiplication table: ");
		int num = scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
		
	}
}
