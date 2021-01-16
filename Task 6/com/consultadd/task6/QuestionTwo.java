/**
 * 
 */
package com.consultadd.task6;


/**
 * @author siddharthnaik
 *
 */
public class QuestionTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Robert", 1994, 1000, "64C- Walls Streat");
		Employee emp2 = new Employee("Sam", 2000, 10000, "68D- Walls Streat");
		Employee emp3 = new Employee("John", 1999, 1000, "26B- Walls Streat");
		
		System.out.println("Name"+"\t"+"Year of joining"+"\t"+"Salary"+"\t"+"Address");
		emp1.display();
		emp2.display();
		emp3.display();
	}

}

class Employee{
	String name;
	int joiningYear;
	int salary;
	String address;
	
	Employee(){
		this.name = "XYZ";
		this.joiningYear = 1990;
		this.salary = 100000;
		this.address = "House No. 4, ABC Street, Fremont, CA 94538";
	}
	
	Employee(String name, int joiningYear, int salary, String address){
		this.name = name;
		this.joiningYear = joiningYear;
		this.salary = salary;
		this.address = address;
	}
	
	public void display() {
		System.out.println(this.name+"\t\t"+this.joiningYear+"\t"+this.salary+"\t"+this.address);
	}
	
}
