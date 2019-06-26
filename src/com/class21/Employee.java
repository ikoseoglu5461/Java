package com.class21;

public class Employee {

	
	static String Ceo="Sumair";
	String eID;
	int salary;
	
	public static void main(String[] args) {
	/*Create a Class called Employee:
	 *Create three  variables  eID , salary and set the CEO to “Sumair”
     *Create two objects of the class Employee
     *Set the value of eID, salary for each of the objects
     *Print out the eID , salary and  CEO for each of the objects
	 */
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		emp1.eID="Ismail";
		emp1.salary=6000;
		emp2.eID="Ali";
		emp2.salary=5000;
		
		emp1.infoEmployee();
		emp2.infoEmployee();
		
	}
	void infoEmployee() {
		System.out.println("Employee name is "+eID +" he makes  " +salary +"$ "+ "he is ceo name is  "+Ceo);
	}

}
