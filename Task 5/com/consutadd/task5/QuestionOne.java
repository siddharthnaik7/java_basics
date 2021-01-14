/**
 * 
 */
package com.consutadd.task5;

/**
 * @author siddharthnaik
 *
 */
public class QuestionOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "How is the weather today ?";
		
		String [] strTemp = str.split(" ");
		int min = 999;
		String minString = "";
		
		for(int i=0;i<strTemp.length;i++) {
			if(strTemp[i].length()<=min) {
				min=strTemp[i].length();
				minString = strTemp[i];
			}
		}
		System.out.println(minString);
	}

}
