/**
 * 
 */
package com.consutadd.task5;

/**
 * @author siddharthnaik
 *
 */
public class QuestionSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuestionSix qSix = new QuestionSix();
		qSix.evenFromOdd();
		qSix.oddFromEven();
	}

	public void evenFromOdd() {
		int [] arrOdd = {23,25,75,87,47,1,91,51,2};
		
		for(int i: arrOdd) {
			if(i%2==0) System.out.println(i);
		}
	}
	
	public void oddFromEven() {
		int [] arrEven = {22,44,64,76,98,12,43,54,90};
		
		for(int i: arrEven) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
}
