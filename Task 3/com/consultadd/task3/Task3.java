/**
 * 
 */
package com.consultadd.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



/**
 * @author siddharthnaik
 *
 */
public class Task3 {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task3 taskThree = new Task3();
		
		
		//taskThree.multiplication();
		//taskThree.sumNAvg();
		//taskThree.daysInMonth();
		//taskThree.sumOfNaturalNumber();
		//taskThree.longInput();
		//taskThree.increasingDecreasing();
		
		//taskThree.numberOfDaysInMonthOfYear();
		//taskThree.leapYear();
		
		
		//taskThree.rightTrianglePattern();
		//taskThree.pascalsTrianglePattern();
		taskThree.numberComparision();
	}
	
	
	// Q1
	public void multiplication() {
		
		System.out.println("\n1. Number Multiplication");
		
		System.out.println("Enter the number for multiplication table: ");
		int num = scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
		
	}
	
	
	// Q2
	public void sumNAvg() {
		
		System.out.println("\n2. Sum N Average of 10 Numbers");
		
		int arr [] = new int[10];
		System.out.println("Enter 10 numbers for Sum N Average Operations: ");
		int sum = 0;
		
		for(int i=0;i<10;i++) {
			arr[i] = scanner.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of 10 numbers is: " + sum);
		System.out.println("Average of 10 numbers is: " + sum/10);
	}
	
	// Q3
	public void daysInMonth() {
		
		System.out.println("\n3. Number of Days in a Month");
		
		System.out.println("Enter month number (Between 1 to 12 only): ");
		int  m = scanner.nextInt();
		
		if(m<1 || m>12) {
			System.out.println("Invalid Details");
		} else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
			System.out.println("There are 31 days in this month!");
		} else if(m==2) {
			System.out.println("There are either 28 or 29 days in month!");
		} else {
			System.out.println("There are 30 days in this month!");
		}
		
	}
	
	// Q4
	public void sumOfNaturalNumber() {
		
		System.out.println("\n4. Sum of Natural Numbers");
		
		System.out.println("Enter a natural number: ");
		int num = scanner.nextInt();
		int sum = 0;
		while(num>=0) {
			sum+=num;
			num--;
		}
		System.out.println("Sum is: " + sum);
	}
	
	// Q5
	public void longInput() {
		
		System.out.println("\n5. Long Numbers");
		
		System.out.println("Enter a long integer: ");
		long num = scanner.nextLong();
		String str = Long.toString(num);
		int len = str.length();
		System.out.println("Number of digits in input number is: " + len);
		int sum=0;
		for(int i=0;i<len;i++) {
			sum+= Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		System.out.println("Sum of number is: "+ sum);
	}
	
	// Q6
	public void increasingDecreasing() {
		
		System.out.println("\n6. Increasing Decreasing Numbers");
		
		System.out.println("Enter Three Numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1<num2 && num2<num3) {
			System.out.println("Increasing");
		} else if(num1>num2 && num2>num3) {
			System.out.println("Decreasing");
		} else {
			System.out.println("Neither increasing or decreasing order");
		}
	}
	
	// Q7
	public void numberOfDaysInMonthOfYear() {
		
		System.out.println("\n7. Number of Days in a Month of Year!");
		
		System.out.println("Enter a month number: ");
		int month = scanner.nextInt();
		
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();
		
		@SuppressWarnings("deprecation")
		Date date = new Date(year, month-1, 1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		String monthName = sdf.format(date);
		
		YearMonth yearMonth = YearMonth.of(year, month);
		int days = yearMonth.lengthOfMonth();
		
		System.out.println(monthName + " " + year + " has " + days + " days!");
		
	}
	
	// Q8
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
	
	// Q9
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
	
	// Q10
	public void pascalsTrianglePattern() {
		
		System.out.println("\n10. Number Pattern Displayed in Pascal Triangle Form");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("How many Rows: ");
	   	try
	   	{
	   		int rows = Integer.parseInt(br.readLine());
	   		int p=0;
	   		int q=0;

	   		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(new Integer[0]));
	   		al.add(1);

	   		for(int j=1;rows>0;rows--,j++)
	   		{
	   			for(int i=rows-1;i>0;i--)
	   	 		{
	   	 			System.out.print(" ");
	   	 		}
	   	 		ArrayList<Integer> al_new = new ArrayList<Integer>(Arrays.asList(new Integer[j]));


	   	 		al_new.set(0,al.get(0));
	   	 		al_new.set(al_new.size()-1,al.get(al.size()-1));

	   	 		for(p=0,q=p+1;q<al.size();p++,q++)
	   	 		{
	   	 			al_new.set(q, al.get(p)+al.get(q));
	   	 		}

				al = new ArrayList<Integer>();
	   	 		for(int k=0;k<al_new.size();k++){
	   	 			System.out.print(al_new.get(k)+" ");
	   	 			al.add(al_new.get(k));
	   	 		}

	   	 		System.out.println("");
	   	 	}
		}
		catch(Exception e)
		{
	   		System.out.print(e);
		}
	}
	
	// Q11
	public void numberComparision() {
		
		System.out.println("Enter 2 decimal numbers upto 2 decimal values: ");
		 float num1 = scanner.nextFloat();
		 float num2 = scanner.nextFloat();
		 
		 if(Math.abs(num1-num2)==0.00) {
			 System.out.println("The 2 numbers are same!");
		 } else {
			 System.out.println("The 2 numbers are not same!");
		 }
	}

}




