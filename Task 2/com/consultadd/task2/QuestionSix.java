/**
 * 
 */
package com.consultadd.task2;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionSix {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionSix qSix = new QuestionSix();
		qSix.divisibleByThree();
	}

	public void divisibleByThree() {
		
		System.out.println("\n6. Divisible By Three!");
		
		for(int i=0; i<7; i++) {
			if(i==0) {
				System.out.println(i);
				continue;
			}
			if(i%3!=0) System.out.println(i);
		}
	}
}
