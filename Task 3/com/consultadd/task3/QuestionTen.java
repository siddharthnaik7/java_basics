/**
 * 
 */
package com.consultadd.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author siddharthnaik
 *
 */
public class QuestionTen {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionTen qTen = new QuestionTen();
		qTen.pascalsTrianglePattern();
	}
	
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

}
