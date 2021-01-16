/**
 * 
 */
package com.consultadd.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionOne {

	/**
	 * @param args
	 */
	
	static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n1. Complex Numbers - Arithmetic Operations");
		scanner = new Scanner(System.in);
		List<Double> dList = new ArrayList<Double>();
		
		System.out.println("Enter 2 Complex Numbers: ");
		int count=0;
		while(count<2) {
			System.out.println("Enter Real Part: ");
			dList.add(scanner.nextDouble());
			System.out.println("Enter Imaginary Part: ");
			dList.add(scanner.nextDouble());
			count++;
		}
		
		Complex complex1 = new Complex(dList.get(0), dList.get(1));
		Complex complex2 = new Complex(dList.get(2), dList.get(3));
		
		
		Complex complexOperaton = new Complex(0, 0);
		complexOperaton = complexOperaton.add(complex1, complex2);
		System.out.println("The sum is: " + complexOperaton.real + " + " + complexOperaton.imaginary +"i");

		complexOperaton = complexOperaton.subtract(complex1, complex2);
		System.out.println("The difference is: " + complexOperaton.real + " + " + complexOperaton.imaginary+"i");
		
		complexOperaton = complexOperaton.multiply(complex1, complex2);
		System.out.println("The product is: " + complexOperaton.real + " + " + complexOperaton.imaginary+"i");
		
	}

}

class Complex{
	
	double real, imaginary;
	
	Complex(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex a, Complex b) {
		Complex tempComplex = new Complex(0, 0);
		
		tempComplex.real = a.real + b.real;
		tempComplex.imaginary = a.imaginary + b.imaginary;
		
		return tempComplex;
	}
	
	public Complex subtract(Complex a, Complex b) {
		Complex tempComplex = new Complex(0, 0);
		
		tempComplex.real = a.real - b.real;
		tempComplex.imaginary = a.imaginary - b.imaginary;
		
		return tempComplex;
	}
	
	public Complex multiply(Complex a, Complex b) {
		Complex tempComplex = new Complex(0, 0);
		
		tempComplex.real = (a.real * b.real) - (a.imaginary * b.imaginary);
		tempComplex.imaginary = (a.real * b.imaginary) + (a.imaginary * b.real);
		
		return tempComplex;
	}
}
