package com.class22;

public class TestSyntaxStudents {

	public static void main(String[] args) {
		
//		SyntaxStudent student1=new SyntaxStudent ();
//		student1.studentName="Sumair";
//		student1.studentLastName="Aziz";
//		
//		student1.getStudentDetails();
//		
//		SyntaxStudent student2=new SyntaxStudent ();
//		student2.studentName="Mohammed";
//		student2.studentLastName="Ali";
//		
//		student2.getStudentDetails();
		
		SyntaxStudent student1=new SyntaxStudent("Ismail", "Koseoglu");
		
		student1.getStudentDetails();
		
		SyntaxStudent student2=new SyntaxStudent("Ali", "Akpinar");
		
		student2.getStudentDetails();
	}

}
