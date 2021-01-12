/**
 * 
 */
package com.consultadd.task3;

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
		qNine.rightTrianglePattern();
	}

	public void rightTrianglePattern() {
		
		System.out.println("\n9. Number Pattern Displayed in Rt. Triangle Form");
		
		System.out.println("Input number of rows: ");
		int rows = scanner.nextInt();
		
		for(int i=0; i<rows; i++) {
			for(int j=1; j<=i+1; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}
}
