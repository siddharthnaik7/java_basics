/**
 * 
 */
package com.consultadd.task4;

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
		int a [] = {1,2,5,2,1,7,3,3,9,1,5,8,6};
		int max=0;
		int minDiff = 999;
		int max_2 = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) max=a[i];
		}
		for(int i=0;i<a.length;i++) {
			if(max!=a[i] && max-a[i]<minDiff) {
				minDiff=max-a[i];
				max_2=a[i];
			}
		}
		
		System.out.println(max_2);
	}

}
