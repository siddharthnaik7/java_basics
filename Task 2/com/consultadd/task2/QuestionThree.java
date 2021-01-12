/**
 * 
 */
package com.consultadd.task2;

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
		qThree.flowchart();
	}

	public void flowchart() {
		
		System.out.println("\n3. Flowchart!");
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int avg = (a + b + c)/3;
		System.out.println("avg = " + avg);
		
		if (avg>a && avg>b && avg>c) {
			System.out.println("avg is higher than a, b, c");
		} else if(avg>a && avg>b) {
			System.out.println("avg is higher than a, b");
		} else if(avg>a && avg>c) {
			System.out.println("avg is higher than a, c");
		} else if(avg>b && avg>c) {
			System.out.println("avg is higher than b, c");
		} else if(avg>a) {
			System.out.println("avg is higher than a");
		} else if(avg>b) {
			System.out.println("avg is higher than b");
		} else if(avg>c) {
			System.out.println("avg is higher than c");
		}
	}
}
