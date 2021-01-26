/**
 * 
 */
package com.consultadd.task7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author siddharthnaik
 *
 */
public class QuestionThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = {4,9,5};
		Integer [] b = {9,4,9,8,4};
		
		List<Integer> iL = new LinkedList<Integer>();
		Set<Integer> aSet = new TreeSet<Integer>(Arrays.asList(a));
		Set<Integer> bSet = new TreeSet<Integer>(Arrays.asList(b));
		for(Integer i: aSet) {
			if(bSet.contains(i)) {
				iL.add(i);
			}
		}
		System.out.println(iL);
	}

}
