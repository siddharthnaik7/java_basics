/**
 * 
 */
package com.consultadd.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author siddharthnaik
 *
 */
public class QuestionFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {0,1,2,9,0,30,5,1,0,88,76,98,3,120};
		
		List<Integer> zeroList = new ArrayList<Integer>();
		List<Integer> numberList = new ArrayList<Integer>();
		
		for(int i : a) {
			if(i==0) {
				zeroList.add(i);
			} else numberList.add(i);
		}
		numberList.addAll(numberList.size(), zeroList);
		System.out.println(numberList);
	}

}
