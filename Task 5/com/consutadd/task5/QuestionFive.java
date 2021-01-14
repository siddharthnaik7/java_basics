/**
 * 
 */
package com.consutadd.task5;

/**
 * @author siddharthnaik
 *
 */
public class QuestionFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Be Happy and Stay Motivated";
		
		String [] strSplit = str.split(" ");
		
		for(String s: strSplit) {
			StringBuilder sB = new StringBuilder(s);
			sB.reverse();
			System.out.print(sB.toString()+ " ");
		}
		
		
	}

}
