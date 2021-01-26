/**
 * 
 */
package com.consultadd.task7;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter a numbe: ");
		char ch [] = scanner.next().toCharArray();
		scanner.close();
		String str = String.valueOf(ch);
		int i=0;
		for(char c:ch) {
			int t = Integer.valueOf(String.valueOf(c));
			i+=t*t*t;
		}
		if(String.valueOf(i).equals(str)) {
			System.out.println("This number is an Arstrong number!");
		}else System.out.println("This number is not an Arstrong number!");
	}

}
