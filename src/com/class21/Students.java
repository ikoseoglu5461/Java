package com.class21;

public class Students {
	
	int numberOfStudents;
	int studentID;
	String studentName;

	public static void main(String[] args) {
		/*Create a Class called Students
		 * Create three  variables  studentName , studentID  and  numberOfStudents
		 * Create three objects of the Students Class
		 * Set the value for  studentName , studentID and increment  the numberOfStudents for each object
		 * Print out  total number of students
		 */
		Students class1=new Students();
		Students class2=new Students();
		Students class3=new Students();
		
		class1.numberOfStudents=20;
		class1.studentID=61;
		class1.studentName="Ali";
		
		class2.numberOfStudents=15;
		class2.studentID=54;
		class2.studentName="Ahmet";
		
		class3.numberOfStudents=18;
		class3.studentID=34;
		class3.studentName="Adnan";
		
		///int sum=class1.numberOfStudents+class2.numberOfStudents+class3.numberOfStudents;
		//System.out.println(sum);
		
		class1.getTotalNumberOfStudents();
		class2.getTotalNumberOfStudents();
		class3.getTotalNumberOfStudents();
		
	}
	
	void getTotalNumberOfStudents() {
	System.out.println(numberOfStudents);
	}

}

	

