/**
 * 
 */
package com.consultadd.task6;

/**
 * @author siddharthnaik
 *
 */
public class QuestionFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(10, 20);
		Rectangle rect3 = new Rectangle(30);
		
		System.out.println("Area 1 is: " + rect1.area());
		System.out.println("Area 2 is: " + rect2.area());
		System.out.println("Area 3 is: " + rect3.area());
	}
	

}

class Rectangle{
	float length;
	float breadth;
	
	Rectangle(){
		this.length=0;
		this.breadth=0;
	}
	Rectangle(float length, float breadth){
		this.length=length;
		this.breadth=breadth;
	}
	Rectangle(float value){
		this.length=this.breadth=value;
	}
	
	public float area() {
		return this.length*this.breadth;
	}
}