/**
 * 
 */
package com.consutadd.task5;

/**
 * @author siddharthnaik
 *
 */
public class QuestionEight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "({{)}[}]()";
		
		//String str = "[})(";
		
		int count =0;
		
		char [] ch = str.toCharArray();
		
		for(char c: ch) {
			if(c=='(') {
				count+=1;
			} else if (c=='{') {
				count+=2;
			} else if(c=='[') {
				count+=3;
			} else if(c==')') {
				count-=1;
			} else if(c=='}') {
				count-=2;
			} else if(c==']') {
				count-=3;
			}
		}
		
		if(count==0) {
			System.out.println(true);
		}else System.out.println(false);
	}

}
