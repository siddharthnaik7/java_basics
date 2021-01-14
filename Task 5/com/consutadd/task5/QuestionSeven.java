/**
 * 
 */
package com.consutadd.task5;

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
		String str = "heLLo WOrLd";
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
			} else if(Character.isLowerCase(ch[i])) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		
		System.out.println(String.valueOf(ch));
	}

}
