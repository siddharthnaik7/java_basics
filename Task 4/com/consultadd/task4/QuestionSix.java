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
public class QuestionSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,2,3,3,4,4,4,11,11,11,11};
		List<Integer> zeroList = new ArrayList<Integer>();
		List<Integer> numberList = new ArrayList<Integer>();
		
		for(int i: a) {
			if(numberList.contains(i)) {
				zeroList.add(0);
			}else numberList.add(i);
		}
		
		numberList.addAll(numberList.size(), zeroList);
		System.out.println(numberList);
	}

}
