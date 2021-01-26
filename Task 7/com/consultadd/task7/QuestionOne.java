/**
 * 
 */
package com.consultadd.task7;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionOne Qone = new QuestionOne();
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		System.out.println("Reverse is: " +Qone.reverse(scanner.nextLine()));
		scanner.close();
	}
	
	public String reverse(String str) {
		char[] cArray = str.toCharArray();
		StringBuffer sBuff = new StringBuffer();
		for(int i=cArray.length-1;i>=0;i--) {
			sBuff.append(cArray[i]);
		}
		
		return sBuff.toString();
	}

}
