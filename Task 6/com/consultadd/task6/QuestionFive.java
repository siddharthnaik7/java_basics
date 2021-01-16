/**
 * 
 */
package com.consultadd.task6;

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
		AddAmount amt = new AddAmount();
		AddAmount amt1 = new AddAmount(1860);
		
		amt.amountDisplay();
		amt.transactionCount();
		amt1.amountDisplay();
		amt1.transactionCount();
	}

}

class AddAmount{
	
	static int instaneCounter=0;
	float amount = 50f;
	int ct=0;
	
	AddAmount(){
		System.out.println("No amount to be added");
		instaneCounter++;
		ct=instaneCounter;
	}
	AddAmount(float value){
		this.amount+=value;
		instaneCounter++;
		ct=instaneCounter;
	}
	
	public void amountDisplay() {
		System.out.println("Total Amount: " + this.amount);
	}
	
	public void transactionCount() {
		System.out.println("No. of transactions performed: " + ct);
	}
}