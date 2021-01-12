/**
 * 
 */
package com.consultadd.task3;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionTwo {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionTwo qTwo = new QuestionTwo();
		qTwo.sumNAvg();
	}

	public void sumNAvg() {
		
		System.out.println("\n2. Sum N Average of 10 Numbers");
		
		int arr [] = new int[10];
		System.out.println("Enter 10 numbers for Sum N Average Operations: ");
		int sum = 0;
		
		for(int i=0;i<10;i++) {
			arr[i] = scanner.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of 10 numbers is: " + sum);
		System.out.println("Average of 10 numbers is: " + sum/10);
	}
}
