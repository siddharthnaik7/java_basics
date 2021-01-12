/**
 * 
 */
package com.consultadd.task3;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionEight {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionEight qEight = new QuestionEight();
		qEight.leapYear();
	}

	public void leapYear() {
		
		System.out.println("\n8. Leap Year!");
		
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();
		
		boolean bl = false;
		
		if(year%4==0) {
			
			if(year%100==0) {
				
				if(year%400==0) {
					bl = true;
				}
				
			}
			
			else {
				bl = true;
			}
		}
		if(bl) {
			System.out.println(year + " is a leap year!");
		}else {
			System.out.println(year + " is not a leap year!");
		}
	}
}
