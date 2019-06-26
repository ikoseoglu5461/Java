package com.class24;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp=new Employee();
		FullTimeEmployee ft=new FullTimeEmployee();
		Contractor cnt=new Contractor();
		
		emp.getPaid();// Employee gets paid salary
		ft.getPaid();// Full time employee gets paid salary+bonus
		cnt.getPaid();// contractor gets paid hourly
	}
	

}
