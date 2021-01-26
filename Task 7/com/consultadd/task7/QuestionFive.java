/**
 * 
 */
package com.consultadd.task7;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = scanner.nextLine();
		scanner.close();
		
		System.out.println("This String has "+ str.split(" ").length +" words");
		
		
	}

}
