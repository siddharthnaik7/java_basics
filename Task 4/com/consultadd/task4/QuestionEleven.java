/**
 * 
 */
package com.consultadd.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author siddharthnaik
 *
 */
public class QuestionEleven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,5,2,1,7,3,3,9,1,5,8,6};
		List<Integer> arr = new ArrayList<Integer>();
		Arrays.sort(a);
		for(int i=0, j=a.length-1;i<a.length && j>=0;i++,j--) {
			arr.add(a[j]);
			arr.add(a[i]);
		}
		System.out.println(arr);
	}

}
