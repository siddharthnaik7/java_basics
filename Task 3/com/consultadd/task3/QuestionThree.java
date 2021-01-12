/**
 * 
 */
package com.consultadd.task3;

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
		qThree.daysInMonth();
	}

	public void daysInMonth() {
		
		System.out.println("\n3. Number of Days in a Month");
		
		System.out.println("Enter month number (Between 1 to 12 only): ");
		int  m = scanner.nextInt();
		
		if(m<1 || m>12) {
			System.out.println("Invalid Details");
		} else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
			System.out.println("There are 31 days in this month!");
		} else if(m==2) {
			System.out.println("There are either 28 or 29 days in month!");
		} else {
			System.out.println("There are 30 days in this month!");
		}
		
	}
}
