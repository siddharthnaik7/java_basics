/**
 * 
 */
package com.consultadd.task7;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		char[] chr = scanner.next().toCharArray();
		scanner.close();
		List<Character> ch = new LinkedList<Character>();
		boolean j = false;
		for(char c: chr) {
			if(ch.contains(c)) {
				j = true;
				break;
			}else {
				ch.add(c);
			}
		}
		if(j) {
			System.out.println("This string does not have unique characters!");
		}else System.out.println("This string has unique characters!");
	}

}
