/**
 * 
 */
package com.consutadd.task5;

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

		String str = "How is the weather today ?";
		
		String [] strTemp = str.split("\s");
		
		for(String s : strTemp) {
			System.out.print(s);
		}
		
	}

}
