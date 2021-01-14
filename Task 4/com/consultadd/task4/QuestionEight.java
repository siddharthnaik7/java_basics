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
public class QuestionEight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,5,2,1,7,3,3,9,1,5,8,6};
		List<Integer> b = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(b.isEmpty()) b.add(a[i]);
			if(b.contains(a[i])) {
				continue;
			}else b.add(a[i]);
		}
		
		System.out.println(b.size());
	}

}
