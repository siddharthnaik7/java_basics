/**
 * 
 */
package com.consutadd.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author siddharthnaik
 *
 */
public class QuestionFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Consultadd";
		
		char ch[] = str.toCharArray();
		
		List<Character> arr = new ArrayList<Character>();
		boolean flag = true;
		
		for(char i: ch) {
			if(!arr.contains(i)) {
				arr.add(i);
			} else {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}

}
