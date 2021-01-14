/**
 * 
 */
package com.consultadd.task4;

/**
 * @author siddharthnaik
 *
 */
public class QuestionNine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,4,5,6};
		int target = 6;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					System.out.println("("+ a[i] + "," + a[j] +") = " + (a[i]+a[j]));
				}
			}
		}
	}

}
