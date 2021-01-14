/**
 * 
 */
package com.consultadd.task4;

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
		int a [] = {-1,5,1,7,9,1,5,8,6};
		int min=999;
		int minDiff = 999;
		int min_2 = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) min=a[i];
		}
		for(int i=0;i<a.length;i++) {
			if(min!=a[i] && a[i]-min<minDiff) {
				minDiff=a[i]-min;
				min_2=a[i];
			}
		}
		
		System.out.println(min_2);
	}
}


