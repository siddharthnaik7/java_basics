/**
 * 
 */
package com.consultadd.task7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author siddharthnaik
 *
 */
public class QuestionTen {

	/**
	 * @param args
	 */
	static Set<String> stre = new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionTen q10 = new QuestionTen();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = s.next();
		s.close();
		q10.permutation(str,"");
		System.out.println(stre);
	}
	
	void permutation(String str, String ans) {
		if(str.length()==0) {
			stre.add(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			String ros = str.subSequence(0, i) + str.substring(i+1);
			
			permutation(ros, ans+ch);
		}
	}

}
