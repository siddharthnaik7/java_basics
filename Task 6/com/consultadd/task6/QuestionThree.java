/**
 * 
 */
package com.consultadd.task6;

/**
 * @author siddharthnaik
 *
 */
public class QuestionThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.display();
		
		Student std2 = new Student("Siddharth");
		std2.display();
	}

}

class Student{
	String name;
	
	Student(){
		this.name="Unknown";
	}
	Student(String name){
		this.name=name;
	}
	
	public void display() {
		System.out.println(this.name);
	}
}
