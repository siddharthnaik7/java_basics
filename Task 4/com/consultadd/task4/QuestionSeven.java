/**
 * 
 */
package com.consultadd.task4;

/**
 * @author siddharthnaik
 *
 */
public class QuestionSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,2,3,3,4,4,4,11,11,11,11};
		int max = 0;
		int min = 999;
		
		for(int i: a) {
			if(i>=max) max=i;
			if(i<=min) min=i;
		}
		System.out.println(max-min);
	}

}
