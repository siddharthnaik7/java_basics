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
public class QuestionEight {

	/**
	 * @param args
	 */
	static Set<String> stringSet = new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionEight Qeight = new QuestionEight();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = s.next();
		s.close();
		
		stringSet.add(str);
		char c[] = str.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				char dc[] = c;
				char chr = dc[i];
				dc[i] = dc[j];
				dc[j] = chr;
				Qeight.replace(dc);
			}
		}
		System.out.println("Possible Permutations are: "+stringSet);
	}
	void replace(char []cj) {
		for(int i=1;i<cj.length;i++) {
			for(int j=1;j<cj.length;j++) {
				char chr = cj[i];
				cj[i]=cj[j];
				cj[j]=chr;
				stringSet.add(String.valueOf(cj));
			}
		}
	}

}
