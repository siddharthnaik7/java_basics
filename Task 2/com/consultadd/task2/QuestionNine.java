/**
 * 
 */
package com.consultadd.task2;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionNine {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionNine qNine = new QuestionNine();
		qNine.charCheck();
	}

	public void charCheck() {
		
		System.out.println("\n9. Character Check!");
		
		System.out.println("Enter a character: ");
		char ch = Character.toLowerCase(scanner.next().charAt(0));
		
		if(ch=='r' || ch=='a' || ch=='n' || ch=='d' || ch=='o' || ch=='m') {
			System.out.println("FOUND");
		} else System.out.println("NOT FOUND");
	}
}
