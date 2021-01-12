/**
 * 
 */
package com.consultadd.task2;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionTwo {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionTwo qTwo = new QuestionTwo();
		qTwo.operatorBasedTasks();
	}

	public void operatorBasedTasks() {
		
		System.out.println("\n2. Operator based Task!");
		
		char ch;
		
		do {
			System.out.println();
			int first = 0, second = 0, first1 = 0, second2 =0, result = 0;
			System.out.println("Press \"1\" for Addition");
			System.out.println("Press \"2\" for Subtraction");
			System.out.println("Press \"3\" for Division");
			System.out.println("Press \"4\" for Multiplication");
			System.out.println("Press \"5\" for Average");
			System.out.println("Press \"s\" to Exit");
			
			System.out.println("Enter your selection: ");
			ch = scanner.next().charAt(0);
			
			System.out.println("Enter two number (Integers): ");
			if(ch=='1' || ch=='2' || ch=='3' || ch=='4') {
				first = scanner.nextInt();
				second = scanner.nextInt();
			} else if (ch=='5') {
				first1 = scanner.nextInt();
				second2 = scanner.nextInt();
			}
			
			switch(ch) {
				case '1':
					result = first+second;
					break;
				case '2':
					result = first-second;
					break;
				case '3':
					result = first/second;
					break;
				case '4':
					result = first*second;
					break;
				case '5':
					result = (first1+second2)/2;
					break;
				
			}
			if(result>0 && ch!='s') {
				System.out.println("The Result is: " + result);
			} else if(ch!='s') {
				System.out.println("Option " + ch + " is returning a negative number!");
			}
			
		} while(ch!='s');
		
		System.out.println("Operator Based Task Completed!");
	}
}
