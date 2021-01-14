/**
 * 
 */
package com.consutadd.task5;

/**
 * @author siddharthnaik
 *
 */
public class QuestionTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,2,3,3,4,4,4,11,11,11,11};
		int max = 0;
		int min = 999;
		int sum=0;
		
		for(int i: a) {
			if(i>=max) max=i;
			if(i<=min) min=i;
		}
		for(int i: a) {
			if(i!=min && i!=max) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
