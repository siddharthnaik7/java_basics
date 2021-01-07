/**
 * 
 */
package com.consultadd.task1n2;

import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class TaskTwo {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TaskTwo tTwo = new TaskTwo();
		
		// Uncomment the question to be executed!
		
		// Q1
		//tTwo.printIfDivisible();
		
		// Q2
		//tTwo.operatorBasedTasks();
		
		// Q3
		//tTwo.flowchart();
		
		// Q4
		//tTwo.breakAndContinue();
		
		// Q5
		//tTwo.divisibleAndMultiple();
		
		// Q6
		//tTwo.divisibleByThree();
		
		// Q7
		//tTwo.conditionalActions();
		
		// Q8
		//tTwo.positiveNegative();
		
		// Q9
		//tTwo.charCheck();
		
	}

	// Q1
	public void printIfDivisible() {
		
		System.out.println("1. Print if Divisible!");
		
		System.out.println("Enter a number (Integer): ");
		int num = scanner.nextInt();
		System.out.println("The entered number is: " + num);
		if(num%3==0) {
			System.out.println("Consultadd");
		} else if(num%5==0) {
			System.out.println("JAVA TRAINING");
		} else if(num%3==0 && num%5==0) {
			System.out.println("Consultadd JAVA Training");
		} else System.out.println("Out of Scope");
	}
	
	// Q2
	public void operatorBasedTasks() {
		
		System.out.println("\n2. Operator based Task!");
		
		int selection;
		
		do {
			System.out.println();
			int first, second, first1, second2;
			System.out.println("Press \"1\" for Addition");
			System.out.println("Press \"2\" for Subtraction");
			System.out.println("Press \"3\" for Division");
			System.out.println("Press \"4\" for Multiplication");
			System.out.println("Press \"5\" for Average");
			System.out.println("Press \"6\" to Exit");
			
			System.out.println("Enter your selection: ");
			selection = scanner.nextInt();
			switch(selection) {
				case 1:
					System.out.println("Enter two number (Integers): ");
					first = scanner.nextInt();
					second = scanner.nextInt();
					System.out.println("The addition of two numbers is: " + first + second);
					break;
				case 2:
					System.out.println("Enter two number (Integers): ");
					first = scanner.nextInt();
					second = scanner.nextInt();
					System.out.println("The subtraction of two numbers is: " + (first - second));
					break;
				case 3:
					System.out.println("Enter two number (Integers): ");
					first = scanner.nextInt();
					second = scanner.nextInt();
					System.out.println("The division of two numbers is: " + first/second);
					break;
				case 4:
					System.out.println("Enter two number (Integers): ");
					first = scanner.nextInt();
					second = scanner.nextInt();
					System.out.println("The multiplication of two numbers is: " + first*second);
					break;
				case 5:
					System.out.println("Enter two number (Integers): ");
					first1 = scanner.nextInt();
					second2 = scanner.nextInt();
					System.out.println("The average of two numbers is: " + (first1+second2)/2);
					break;
				
			}
		} while(selection<6);
		
		System.out.println("Operator Based Task Completed!");
	}
	
	// Q3
	public void flowchart() {
		
		System.out.println("\n3. Flowchart!");
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int avg = (a + b + c)/3;
		System.out.println("avg = " + avg);
		
		if (avg>a && avg>b && avg>c) {
			System.out.println("avg is higher than a, b, c");
		} else if(avg>a && avg>b) {
			System.out.println("avg is higher than a, b");
		} else if(avg>a && avg>c) {
			System.out.println("avg is higher than a, c");
		} else if(avg>b && avg>c) {
			System.out.println("avg is higher than b, c");
		} else if(avg>a) {
			System.out.println("avg is higher than a");
		} else if(avg>b) {
			System.out.println("avg is higher than b");
		} else if(avg>c) {
			System.out.println("avg is higher than c");
		}
	}
	
	// Q4
	public void breakAndContinue() {
		
		System.out.println("\n4. Break and Continue!");
		
		int num = 0;
		
		while(true) {
			System.out.println("Enter a number: ");
			num = scanner.nextInt();
			
			if(num>0) {
				System.out.println("Good Going");
			} else break;
			
		}
		System.out.println("It's Over");
	}
	
	// Q5
	public void divisibleAndMultiple() {
		
		System.out.println("\n5. Divisible and Multiple!");
		
		int num1 = 2000;
		int num2 = 3200;
		
		for(int i=num1; i<=num2; i++) {
			if(i%7==0 && i%5!=0) System.out.println(i);
		}
	}
	
	// Q6
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
	
	// Q7
	public void conditionalActions() {
		
		System.out.println("\n7. Conditional Actions!");
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		if((num%2==1) || (num%2==0 && num>=6 && num<=30)) {
			System.out.println("NEW");
		}
		if ((num%2==0 && num>=2 && num<=5) || (num%2==0 && num>30)) {
			System.out.println("OLD");
		}
	}
	
	// Q8
	public void positiveNegative() {
		
		System.out.println("\n8. Positive Negative!");
		
		System.out.println("Enter a number (Decimal): ");
		float num = scanner.nextFloat();
		
		if (num==0) {
			System.out.println("zero");
		} else if (num<0) {
			System.out.println("negative");
		} else if(num>0) {
			System.out.println("positive");
		}
		if(Math.abs(num)<1) System.out.println("small");
		if(Math.abs(num)>1000000) System.out.println("large");
		
	}
	
	// Q9
	public void charCheck() {
		
		System.out.println("\n9. Character Check!");
		
		System.out.println("Enter a character: ");
		char ch = Character.toLowerCase(scanner.next().charAt(0));
		
		if(ch=='r' || ch=='a' || ch=='n' || ch=='d' || ch=='o' || ch=='m') {
			System.out.println("FOUND");
		} else System.out.println("NOT FOUND");
	}
}


