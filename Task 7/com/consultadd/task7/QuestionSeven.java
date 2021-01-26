/**
 * 
 */
package com.consultadd.task7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = scanner.next();
		scanner.close();
		
		char [] ch  =str.toCharArray();
		
		Map<Character, Integer> cMap = new LinkedHashMap<Character, Integer>();
		
		for(char c: ch) {
			if(cMap.containsKey(c)) {
				cMap.put(c, cMap.get(c)+1);
			}else {
				cMap.put(c, 1);
			}
		}
		
		for(Entry<Character, Integer> e: cMap.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
