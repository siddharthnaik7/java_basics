/**
 * 
 */
package com.consultadd.task3;

import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Date;
import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionSeven {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionSeven qSeven = new QuestionSeven();
		qSeven.numberOfDaysInMonthOfYear();
	}

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
}
