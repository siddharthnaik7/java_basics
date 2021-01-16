/**
 * 
 */
package com.consultadd.task6;

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
		Programming pr = new Programming();
		Programming pr1 = new Programming("Machine Learning!");
	}

}

class Programming{
	Programming(){
		System.out.println("I love programming languages!");
	}
	Programming(String value){
		System.out.println("I love " + value);
	}
}