/**
 * 
 */
package com.consultadd.task7;



/**
 * @author siddharthnaik
 *
 */
public class QuestionNine {

	/**
	 * @param args
	 */
	static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,10,2,4,-4,10,7,18};
		for(int i:a) {
			if(c<i) {
				c=i;
			}
		}
		System.out.println("Maximum value in array is: "+c);
	}

}
